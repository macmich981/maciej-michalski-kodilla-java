package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("warhammer");
        Item item = new Item(new BigDecimal("10"), 15);
        Invoice invoice = new Invoice("1/11/2019");

        item.setProduct(product);
        item.setInvoice(invoice);
        product.getItems().add(item);
        invoice.getItems().add(item);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(item);

        int productId = product.getId();
        int itemId = item.getId();
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, itemId);
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        productDao.deleteById(productId);
        invoiceDao.deleteById(invoiceId);
    }
}
