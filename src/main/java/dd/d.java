package dd;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cb.e;
import com.app.pornhub.R;
import com.mixpanel.android.mpmetrics.k;
import com.mixpanel.android.mpmetrics.r;
import com.mixpanel.android.mpmetrics.s;
import com.mixpanel.android.takeoverinapp.FadingImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(16)
/* loaded from: classes.dex */
public class d extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public k f8917c;

    /* renamed from: f  reason: collision with root package name */
    public s f8918f;

    /* renamed from: j  reason: collision with root package name */
    public int f8919j = -1;

    @Override // android.app.Activity
    public void onBackPressed() {
        s.d(this.f8919j);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY", IntCompanionObject.MAX_VALUE);
        this.f8919j = intExtra;
        s a10 = s.a(intExtra);
        this.f8918f = a10;
        if (a10 == null) {
            e.B("MixpanelAPI.TakeoverInAppActivity", "TakeoverInAppActivity intent received, but nothing was found to show.");
            finish();
            return;
        }
        this.f8917c = k.k(this, a10.f8313f);
        setContentView(R.layout.com_mixpanel_android_activity_notification_full);
        ImageView imageView = (ImageView) findViewById(R.id.com_mixpanel_android_notification_gradient);
        FadingImageView fadingImageView = (FadingImageView) findViewById(R.id.com_mixpanel_android_notification_image);
        TextView textView = (TextView) findViewById(R.id.com_mixpanel_android_notification_title);
        TextView textView2 = (TextView) findViewById(R.id.com_mixpanel_android_notification_subtext);
        ArrayList arrayList = new ArrayList();
        Button button = (Button) findViewById(R.id.com_mixpanel_android_notification_button);
        arrayList.add(button);
        arrayList.add((Button) findViewById(R.id.com_mixpanel_android_notification_second_button));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.com_mixpanel_android_button_exit_wrapper);
        ImageView imageView2 = (ImageView) findViewById(R.id.com_mixpanel_android_image_close);
        r rVar = (r) ((s.b.C0110b) this.f8918f.f8314j).f8315c;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i10 = 0;
        if (getResources().getConfiguration().orientation == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, (int) (point.y * 0.06f));
            linearLayout.setLayoutParams(layoutParams);
        }
        fadingImageView.f8323w = rVar.F;
        imageView.setBackgroundColor(rVar.n);
        int i11 = 8;
        if (rVar.D != null) {
            textView.setVisibility(0);
            textView.setText(rVar.D);
            textView.setTextColor(rVar.E);
        } else {
            textView.setVisibility(8);
        }
        if (rVar.f8171t != null) {
            textView2.setVisibility(0);
            textView2.setText(rVar.f8171t);
            textView2.setTextColor(rVar.f8172u);
        } else {
            textView2.setVisibility(8);
        }
        fadingImageView.setImageBitmap(rVar.f8174z);
        int i12 = 0;
        while (i12 < arrayList.size()) {
            cd.b bVar = rVar.B.size() > i12 ? rVar.B.get(i12) : null;
            Button button2 = (Button) arrayList.get(i12);
            if (bVar != null) {
                button2.setVisibility(i10);
                button2.setText(bVar.f4028f);
                button2.setTextColor(bVar.f4029j);
                button2.setTransformationMethod(null);
                GradientDrawable gradientDrawable = new GradientDrawable();
                int i13 = bVar.f4030m;
                button2.setOnTouchListener(new b(this, i13 != 0 ? Color.rgb((Color.red(864454278) / 2) + (Color.red(i13) / 2), (Color.green(864454278) / 2) + (Color.green(i13) / 2), (Color.blue(864454278) / 2) + (Color.blue(i13) / 2)) : 864454278, gradientDrawable, bVar));
                gradientDrawable.setColor(bVar.f4030m);
                gradientDrawable.setStroke((int) t3.a.h(2.0f, this), bVar.n);
                gradientDrawable.setCornerRadius((int) t3.a.h(5.0f, this));
                button2.setBackground(gradientDrawable);
                button2.setOnClickListener(new c(this, bVar, rVar, i12));
                i11 = 8;
            } else {
                button2.setVisibility(i11);
            }
            i12++;
            i10 = 0;
        }
        if (rVar.B.size() == 1) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams2.weight = 0.0f;
            layoutParams2.width = -2;
            button.setLayoutParams(layoutParams2);
        }
        imageView2.setColorFilter(rVar.C);
        linearLayout.setOnClickListener(new a(this));
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.0f, 0.95f, 1.0f, 1, 0.5f, 1, 1.0f);
        scaleAnimation.setDuration(200L);
        fadingImageView.startAnimation(scaleAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.5f, 1, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(200L);
        textView.startAnimation(translateAnimation);
        textView2.startAnimation(translateAnimation);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Button) it.next()).startAnimation(translateAnimation);
        }
        linearLayout.startAnimation(AnimationUtils.loadAnimation(this, R.anim.com_mixpanel_android_fade_in));
    }
}
