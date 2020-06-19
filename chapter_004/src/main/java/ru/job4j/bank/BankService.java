package ru.job4j.bank;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        findByPassport(passport).ifPresent(user -> {
            ArrayList<Account> accounts = (ArrayList<Account>) users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        });
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user.getPassport().equals(passport)).findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        return findByPassport(passport).flatMap(
                user -> users.get(user).stream().filter(account -> account.getRequisite().equals(requisite)).findFirst()
        );
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcOptAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destOptAccount = findByRequisite(destPassport, destRequisite);
        if (srcOptAccount.isPresent() && destOptAccount.isPresent()) {
            double srcBalance = srcOptAccount.get().getBalance();
            if (srcBalance - amount >= 0) {
                srcOptAccount.get().setBalance(srcBalance - amount);
                destOptAccount.get().setBalance(destOptAccount.get().getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}
