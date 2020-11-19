package ru.geekbrains.spring.lesson1.models;

import org.springframework.context.annotation.Bean;
import ru.geekbrains.spring.lesson1.models.Cart;
import ru.geekbrains.spring.lesson1.models.CartItem;
import ru.geekbrains.spring.lesson1.models.UnknownEntityException;

import java.util.List;


interface CartService {

    /**
     * Returns existing or creates new cart of the specified user.
     */
    Cart getCartOrCreate(String userEmail);

    /**
     * Adds new item into the specified user cart and saves cart.
     *
     * @return updated cart
     */
    Cart addToCart(String userEmail, long productId, int quantity) throws UnknownEntityException;

    /**
     * Adds all the listed items into the specified user cart and saves cart.
     *
     * @return updated cart
     */
    Cart addAllToCart(String userEmail, List<CartItem> itemsToCopy);

    /**
     * Changes delivery option of the specified user cart.
     *
     * @return updated cart
     */
    Cart setDelivery(String userEmail, boolean deliveryIncluded);

    /**
     * Clears the specified user cart.
     *
     * @return updated cart
     */
    Cart clearCart(String userEmail);
}
