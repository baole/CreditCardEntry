package org.baole.creditcardentry;

public interface CardValidCallback {
  /**
   * called when data entry is complete and the card is valid
   * @param card the validated card
   */
  void cardValid(CreditCard card);

  void cardChanged(CreditCard card);
}
