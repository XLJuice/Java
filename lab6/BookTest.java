/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;
/**
 *
 * @author GG
 */
public class BookTest {
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class People.
     */
    @Test
    public void getYearTest() {
        Book book = mock(Book.class);
        when(book.getYear()).thenReturn(1980);
        assertEquals(1980, book.getYear());
    }
    @Test
    public void getPagesTest() {
        Book book = mock(Book.class);
        when(book.getPages()).thenReturn(5000);
        assertEquals(5000, book.getPages());
    }
    
    
    @Test
    public void setPagesTest(){
        Book book = mock(Book.class);
        book.setPages(3457);
        book.setPages(8450);
        book.setPages(157);

        verify(book, times(1)).setPages(8450);
        verify(book, times(3)).setPages(157);
        verify(book, times(1)).setPages(3457);

        InOrder inOrder = inOrder(book);
        inOrder.verify(book).setPages(8450);
        inOrder.verify(book, times(3)).setPages(157);
        inOrder.verify(book).setPages(3457);
    }
}