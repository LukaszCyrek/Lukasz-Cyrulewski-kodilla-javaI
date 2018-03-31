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
import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given


        Invoice listOne = new Invoice("1", new ArrayList<>());
        Invoice listTwo = new Invoice("2", new ArrayList<>());
        Invoice listThree = new Invoice("3", new ArrayList<>());

        Product shoes = new Product("Adidas");
        Product trousers = new Product("Nike");
        Product blouse = new Product("Puma");

        Item ItemFirst = new Item(new BigDecimal("12"), 2, new BigDecimal("30"));
        Item ItemSecond = new Item(new BigDecimal("23"), 4, new BigDecimal("70"));
        Item ItemThird = new Item(new BigDecimal("30"), 5, new BigDecimal("90"));


        listOne.getItems().add(ItemFirst);
        listTwo.getItems().add(ItemSecond);
        listThree.getItems().add(ItemThird);

        //When
        invoiceDao.save(listOne);
        int listOneId = listOne.getId();
        invoiceDao.save(listTwo);
        int listTwoId = listTwo.getId();
        invoiceDao.save(listThree);
        int listThreeId = listThree.getId();

        //Then
        Assert.assertNotEquals(0, listOneId);
        Assert.assertNotEquals(0, listTwoId);
        Assert.assertNotEquals(0, listThreeId);

        //CleanUp
            //    try {
            //invoiceDao.delete(listOneId);
            //invoiceDao.delete(listTwoId);
            //invoiceDao.delete(listThreeId);
            //} catch (Exception e) {
            //    //do nothing
            //}
        }


    }

