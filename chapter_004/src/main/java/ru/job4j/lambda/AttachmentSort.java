package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 22", 34),
                new Attachment("image 333", 13)
        );
        Comparator<Attachment> comparator = Comparator.comparingInt(Attachment::getSize);
        attachments.sort(comparator);
        System.out.println(attachments);
        comparator = Comparator.comparing(Attachment::getName);
        attachments.sort(comparator);
        System.out.println(attachments);

        attachments.sort((left, right) -> right.getName().length() - left.getName().length());
        System.out.println(attachments);
    }
}