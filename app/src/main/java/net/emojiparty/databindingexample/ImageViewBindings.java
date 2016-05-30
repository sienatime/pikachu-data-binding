package net.emojiparty.databindingexample;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by Siena Aguayo on 5/28/16.
 */
public class ImageViewBindings {
  @BindingAdapter("android:imageResource")
  public static void setImage(ImageView view, int resourceId) {
    view.setImageDrawable(view.getContext().getDrawable(resourceId));
  }
}
