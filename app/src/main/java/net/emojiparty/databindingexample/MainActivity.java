package net.emojiparty.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import net.emojiparty.databindingexample.databinding.PikachuActivityBinding;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    PikachuActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.pikachu_activity);
    Pikachu pikachu = new Pikachu();
    binding.setPikachu(pikachu);
  }
}
