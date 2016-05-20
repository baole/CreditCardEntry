package org.baole.creditcardentry.internal;

import android.widget.EditText;

import org.baole.creditcardentry.fields.CreditEntryFieldBase;
import org.baole.creditcardentry.CardType;

/**
 * contract for delegate
 *
 * TODO gut this delegate business
 */
public interface CreditCardFieldDelegate {
  // When the card type is identified
  void onCardTypeChange(CardType type);

  void onCreditCardNumberValid(String remainder);

  void onExpirationDateValid(String remainder);

  // Image should flip to back for security code
  void onSecurityCodeValid(String remainder);

  void onZipCodeValid();

  void onBadInput(EditText field);

  void focusOnField(CreditEntryFieldBase field, String initialValue);

  void focusOnPreviousField(CreditEntryFieldBase field);
}
