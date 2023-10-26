package ru.netology.HW13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotFoundExceptionTest {
    @Test
    public void testException() {
        ShopRepository repo = new ShopRepository();
        repo.add(new Product(
                1,
                "pen",
                100));
        repo.add(new Product(
                122,
                "mouse",
                560));

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(100);
        });

    }

    @Test
    public void testRemove() {
        ShopRepository repo = new ShopRepository();
        repo.add(new Product(
                1,
                "pen",
                100));
        repo.add(new Product(
                122,
                "mouse",
                560));
        repo.add(new Product(
                343,
                "pencil",
                150));

        repo.remove(343);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(343);
        });

    }
}
