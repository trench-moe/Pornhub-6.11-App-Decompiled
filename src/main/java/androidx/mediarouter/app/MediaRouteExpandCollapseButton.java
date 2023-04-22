package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import c0.a;
import com.app.pornhub.R;

/* loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {

    /* renamed from: m  reason: collision with root package name */
    public final AnimationDrawable f2449m;
    public final AnimationDrawable n;

    /* renamed from: t  reason: collision with root package name */
    public final String f2450t;

    /* renamed from: u  reason: collision with root package name */
    public final String f2451u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2452w;
    public View.OnClickListener y;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
            boolean z10 = !mediaRouteExpandCollapseButton.f2452w;
            mediaRouteExpandCollapseButton.f2452w = z10;
            if (z10) {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f2449m);
                MediaRouteExpandCollapseButton.this.f2449m.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.f2451u);
            } else {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.n);
                MediaRouteExpandCollapseButton.this.n.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.f2450t);
            }
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.y;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Object obj = c0.a.f3717a;
        AnimationDrawable animationDrawable = (AnimationDrawable) a.c.b(context, R.drawable.mr_group_expand);
        this.f2449m = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) a.c.b(context, R.drawable.mr_group_collapse);
        this.n = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(p.c(context, i10), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f2450t = string;
        this.f2451u = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new a());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.y = onClickListener;
    }
}
