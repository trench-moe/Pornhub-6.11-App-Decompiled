package uc;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15835a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f15836b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f15837c;
    public final Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f15838e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f15839f;

    /* renamed from: g  reason: collision with root package name */
    public View f15840g;

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f15841h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f15842i = true;

    /* renamed from: j  reason: collision with root package name */
    public volatile Runnable f15843j = null;

    public g(Context context) {
        if (!(context instanceof Activity)) {
            throw new RuntimeException("Context is not an instance of activity: Aborting.");
        }
        this.f15835a = context;
        Drawable b10 = b("iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAQAAAD/5HvMAAADEklEQVRoBe3BXWjVZQDH8d/0HKW00OZ0kh6XiKUiIl0okhARdBcEjUQSmViYkF14K+TCnTNDEd9ShMGgFGZC9HaZqElo0aZDkhAkt2b5np7j8e3P+XazwWE8/+floA9enM9Hqqure0oxn0HSDPCyYqMDm82KjcPYHFRs9GHzq2KjiM1NxUUzLo2KieW4LFVMrMFllWIij0u7Hi/GcIRr7GexRmE8H/E3LgOsY7xG4VUOcJVDNCgUaxnxG2uZoGGsYABfl3hPw5jIh/zOiNUKw/NcodptvmARzfxIqO+ZymL2c4dql5moEGzDpEwtypgU5I+5PORJu89s+eIHYvhGfniLWN6QGxn+IJZ+xsqFT4hpveyYwi1ius5k2bCPUBV66SJPni76qBBql9LxIgkhinQwU1XIUaBEiEc0KQ1TKePvKDNkQI7j+CsxSelYxhB+DpFRCrL04GeQJbJjGsdwO0pGFmQ5gdtPNMmNDNuwKzJDDuQoYdfJWPniXYqk65AHOkl3m3cUhnmcx6zCTHlgFhXMzjFX4ViJWa88cRazVtWCjZh1yRPdmG1QLfgMs7w8UcBsk2pBO2Z5eaKA2SbVgo2YdckT3ZhtUC1YiVmfPNGPWavCsYA/MauQkwdaqGB2nnkKwwpKpCvIA1tJV6RVvsiyE7sSOTnQQhm77WTkxnR+xu04WVkwjpO4HWOa7FjOP/jpIasUjONr/AyxTOlo4h7+TpCTAS2cxN9dJisN00kIUaKTWapCC1spE+IhU5SOPYSqcJZuChTopp8KoXbIhhe4QUzXmCQ7PiamdXIhwzliOcMYufEmsbwuP3xLDEfkizk84Em7x0vyx+eYlKhFEZMOheA5/qXaLXaygCa+I9RhGlnIbv6j2hATFIY1jPiF1TyjYbRyEV8XeFvDeJY2TjFilULRwEEG2c1CjUKWDxjA5S/ayGgUFrGXy3xJgx4v8ri0KybacHlfMfEaLksUE824NCou7mBzU7HRi81pxUYPNl8pNrZg86li4xUukpCQkJCQkJCQkJDwiAvMUV1d3VPqfz17MXquI1uXAAAAAElFTkSuQmCC");
        this.f15837c = b10;
        Drawable b11 = b("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAQAAABIkb+zAAAArklEQVR42u3VyRHCMBBFwQkAcoQ8WJQbEJewby4XRxkzQ3cE/1VpiQAAANhEb73lnj9ruednTVjMz5iwmp8t4cP82Tn3/Ec/mG+++eabb7755ptvvvnmm2+++eYPmv8FyecPCdhz/oCAfecLKHCEClziAs9ogY9MggQJ/5DwlCBBQp2EowQJEmokvCRIkCDhZxJOEZkTLpHLKuEa+SwSMs5fJNwirynhHgAAAJt4A/ZvpX5veSF2AAAAAElFTkSuQmCC");
        this.d = b11;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f15836b = displayMetrics;
        defaultDisplay.getRealMetrics(displayMetrics);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f15841h = relativeLayout;
        int i10 = (int) (((int) (displayMetrics.density * 28.0f)) * 1.5f);
        ImageView a10 = a(b10, this.f15842i, 12, 13);
        this.f15838e = a10;
        a10.setOnClickListener(new b(this));
        relativeLayout.addView(this.f15838e);
        ImageView a11 = a(b11, this.f15843j != null, 10, 9);
        this.f15839f = a11;
        a11.setOnClickListener(new c(this));
        relativeLayout.addView(this.f15839f);
        View view = new View(context);
        this.f15840g = view;
        view.setBackground(new ColorDrawable(-13487566));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 4.0f), -1);
        layoutParams.addRule(13);
        layoutParams.setMargins(0, i10, 0, i10);
        this.f15840g.setLayoutParams(layoutParams);
        this.f15840g.setVisibility(8);
        relativeLayout.addView(this.f15840g);
    }

    public final ImageView a(Drawable drawable, boolean z10, int... iArr) {
        int i10 = (int) (this.f15836b.density * 28.0f);
        int i11 = (int) (i10 * 1.5f);
        int i12 = (i11 - i10) / 2;
        ImageView imageView = new ImageView(this.f15835a);
        imageView.setPadding(i12, i12, i12, i12);
        imageView.setImageDrawable(drawable);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        int i13 = 0;
        for (int i14 : iArr) {
            layoutParams.addRule(i14);
        }
        imageView.setLayoutParams(layoutParams);
        if (!z10) {
            i13 = 4;
        }
        imageView.setVisibility(i13);
        return imageView;
    }

    public final Drawable b(String str) {
        byte[] decode = Base64.decode(str, 0);
        return new BitmapDrawable(this.f15835a.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }
}
