package com.dkitaw.playground.demo_one;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private int maximumnumBook;

  public void health() {
    System.out.println("Person is healthy");
  }
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the maximumnumBook
   */
  public int getMaximumnumBook() {
    return maximumnumBook;
  }

  /**
   * @param maximumnumBook the maximumnumBook to set
   */
  public void setMaximumnumBook(int maximumnumBook) {
    this.maximumnumBook = maximumnumBook;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

}