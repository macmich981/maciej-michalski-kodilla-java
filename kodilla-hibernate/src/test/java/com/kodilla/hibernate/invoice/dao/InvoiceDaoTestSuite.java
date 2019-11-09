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
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("warhammer");
        Product product1 = new Product("long sword");
        Item item = new Item(new BigDecimal("10"), 15);
        Item item1 = new Item(new BigDecimal("5"), 20);
        Invoice invoice = new Invoice("1/11/2019");

        item.setProduct(product);
        item.setInvoice(invoice);
        item1.setProduct(product1);
        item1.setInvoice(invoice);
        product.getItems().add(item);
        product1.getItems().add(item1);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertEquals(2, invoice.getItems().size());
        Assert.assertEquals("warhammer", invoice.getItems().get(0).getProduct().getName());
        Assert.assertEquals("long sword", invoice.getItems().get(1).getProduct().getName());

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}