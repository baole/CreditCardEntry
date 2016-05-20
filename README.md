CreditCardEntry
=========

# Introduction

This library provides an elegant form for credit card entry that can be easily added to a activity or fragment.
Regex is used to validate credit card types and a Luhn check is performed on the card numbers. This form was inspired by the credit entry UI on Square.

 - Smooth interface
 - Identifies credit card type
 - Hides number for privacy
 - Supports VISA, MasterCard, Discover and AMEX


# Including in your project

Add Bintray to the end of your `repositories`

```
    repositories {
        maven {
            url 'https://dl.bintray.com/baole/maven'
        }
    }
```

Add the project to your `dependencies`

```
    dependencies {
        compile 'org.baole.creditcardinput:library::1.3@aar'
    }

```

# Using the library

Please see below for an example.

XML

```
        <org.baole.creditcardentry.CreditCardView
            android:id="@+id/credit_card_form"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:ce_helper_text_color="@color/yellow_500"
            app:ce_include_helper="false"
            app:ce_include_zip="false"/>

```

 * `app:ce_text_color` - change the input field's text color (`Color.BLACK` by default).
 * `app:ce_hint_text_color` - change the input field's hint text color (`Color.LTGRAY` by default).
 * `app:ce_cursor_color` - change the input field's cursor color (`Color.BLACK` by default).
 * `app:ce_default_text_colors` - If true, use text colors provided by the app's theme instead of the
   values provided by `app:text_color`,`app:hint_text_color`, and `app:cursor_color`. This overrides
   the values for those three text colors and causes the text inputs to use the colors provided by
   the application's theme.
 * `app:ce_include_helper` - boolean to show/hide the helper text under the widget (`true` by default (i.e. helper is shown))
 * `app:ce_helper_text_color` - change the text color of the hints that appear below the widget by default.
 * `app:ce_include_zip` - boolean to show/hide the zip code in the form (`true` by default (i.e. zip is shown))
 * `app:ce_include_exp` - boolean to show/hide the exp in the form (`true` by default (i.e. exp is shown))
 * `app:ce_include_security` - boolean to show/hide the security code in the form (`true` by default (i.e. security is shown))
 * `app:ce_card_number_hint` - string to put in as a placeholder (hint) in the credit card number field
 * `app:ce_input_background` - the drawable to use as a background (defaults to white square with black 1px border)


In code:

Listen to CreditCard events

```
    cardView.setOnCardValidCallback(new CardValidCallback() {
        @Override
        public void cardValid(CreditCard creditCard) {
           // TODO
        }

        @Override
        public void cardChanged(CreditCard creditCard) {
           // TODO
        }
    });
```

Process Credit Card data

```
    submit.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View arg0) {
            if(form.isCreditCardValid())
            {
                CreditCard card = cardView.getCreditCard();
                //Pass credit card to service
            }
            else
            {
                //Alert Credit card invalid
            }
        }
    });

```

# TODO

  - Diner's Club is not yet implemented, although the assets and regex seem to be in place

# Version History

###Ver 1.3 (May 20/2016)
 - Prefix attribute with ce_
 - Add callback listener

###Ver 1.0 (May 20/2016)
 - fork from https://github.com/dbachelder/CreditCardEntry/
 - refactoring and publish to Bintray
