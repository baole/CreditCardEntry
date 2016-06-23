package org.baole.creditcardentry.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.baole.creditcardentry.CardValidCallback;
import org.baole.creditcardentry.CreditCard;
import org.baole.creditcardentry.CreditCardView;

public class SimpleActivity extends Activity {
	private static final String TAG = "SimpleActivity";

	CardValidCallback cardValidCallback = new CardValidCallback() {
		@Override
		public void cardValid(CreditCard card) {
			Log.d(TAG, "valid card: " + card);
			Toast.makeText(SimpleActivity.this, "Card valid and complete", Toast.LENGTH_SHORT).show();
		}

		@Override
		public void cardChanged(CreditCard card) {

		}
	};

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simple);

		final CreditCardView zipForm = (CreditCardView) findViewById(R.id.form_with_zip);
		zipForm.setOnCardValidCallback(cardValidCallback);
	}

}
