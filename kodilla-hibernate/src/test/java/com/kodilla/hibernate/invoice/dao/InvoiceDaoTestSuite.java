package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("New invoice");

        Product product = new Product(1, "laptop");
        Product product2 = new Product(2, "pc");
        Product product3 = new Product(3, "mobile phone");

        Item item = new Item(new BigDecimal(50000), 4, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(1000), 5, new BigDecimal(10000));
        Item item3 = new Item(new BigDecimal(700), 4, new BigDecimal(12000));

        product.getItems().add(item);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        //When
        int id = invoiceDao.save(invoice).getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        try {
            invoiceDao.deleteAll();
        } catch (Exception e) {

        }
    }
}