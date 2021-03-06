package fr.gaulupeau.apps.Poche.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import fr.gaulupeau.apps.InThePoche.R;
import fr.gaulupeau.apps.Poche.service.ServiceHelper;

public class AddActivity extends BaseActionBarActivity {

    private EditText pageUrlEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Themes.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        pageUrlEditText = (EditText) findViewById(R.id.page_url);
    }

    public void addButtonClicked(View view) {
        // TODO: check url

        ServiceHelper.addLink(this, pageUrlEditText.getText().toString());
        pageUrlEditText.setText(""); // TODO: show toast instead?
    }

}
