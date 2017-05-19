package fr.ganfra.materialspinner.sample;

import android.os.Bundle;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.ganfra.materialspinner.MaterialSpinner;


public class MainActivity extends ActionBarActivity {

    private static final String ERROR_MSG = "Very very very very very very very very very very very very very very very very very very very long error message to get scrolling or multiline animation when the error button is clicked";

    List<Object> items;

    MaterialSpinner spinner1;
    MaterialSpinner spinner2;
    MaterialSpinner spinner3;
    MaterialSpinner spinner4;

    private boolean shown = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("List Item 1");
        items.add("List Item 2");
        items.add("List Item 3");
        items.add("List Item 4");
        items.add("List Item 5");

        initSpinnerLabel();
        initSpinnerLabelWithHelperText();
        initSpinnerLabelWithHelperTextRequired();
        initSpinnerLabelWithHelperTextRequiredWithData();

    }

    private void initSpinnerLabel() {
        spinner1 = (MaterialSpinner) findViewById(R.id.spinner1);
        spinner1.setItems(items);
        spinner1.setAdapter(null);
    }

    private void initSpinnerLabelWithHelperText() {
        spinner2 = (MaterialSpinner) findViewById(R.id.spinner2);
        spinner2.setItems(items);
        spinner2.setAdapter(null);
    }

    private void initSpinnerLabelWithHelperTextRequired() {
        spinner3 = (MaterialSpinner) findViewById(R.id.spinner3);
        spinner3.setItems(items);
        spinner3.setAdapter(null);
    }

    private void initSpinnerLabelWithHelperTextRequiredWithData() {
        spinner4 = (MaterialSpinner) findViewById(R.id.spinner4);
        spinner4.setItems(items);
        spinner4.setAdapter(null);
        spinner4.setSelection(2);
    }

    public void activateError(View view) {
        if (!shown) {
            spinner1.setError(ERROR_MSG);
            spinner2.setError(ERROR_MSG);
            spinner3.setError(ERROR_MSG);
            spinner4.setError(ERROR_MSG);
        } else {
            spinner1.setError(null);
            spinner2.setError(null);
            spinner3.setError(null);
            spinner4.setError(null);
        }
        shown = !shown;
    }

    public void activateEditEnable(View view) {
        spinner1.setState(MaterialSpinner.STATE_EDIT_ENABLE);
        spinner2.setState(MaterialSpinner.STATE_EDIT_ENABLE);
        spinner3.setState(MaterialSpinner.STATE_EDIT_ENABLE);
        spinner4.setState(MaterialSpinner.STATE_EDIT_ENABLE);
    }

    public void activateEditDisable(View view) {
        spinner1.setState(MaterialSpinner.STATE_EDIT_DISABLE);
        spinner2.setState(MaterialSpinner.STATE_EDIT_DISABLE);
        spinner3.setState(MaterialSpinner.STATE_EDIT_DISABLE);
        spinner4.setState(MaterialSpinner.STATE_EDIT_DISABLE);
    }

    public void activateViewMode(View view) {
        spinner1.setState(MaterialSpinner.STATE_VIEW_ONLY);
        spinner2.setState(MaterialSpinner.STATE_VIEW_ONLY);
        spinner3.setState(MaterialSpinner.STATE_VIEW_ONLY);
        spinner4.setState(MaterialSpinner.STATE_VIEW_ONLY);
    }


}
