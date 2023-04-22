package u1;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.app.pornhub.R;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class e extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f15469j = 0;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f15470c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15471f;

    public e(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f15470c = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        this.f15470c.getOverlay().add(this);
        this.f15471f = true;
    }

    public static void a(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f15471f) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f15470c.setTag(R.id.ghost_view_holder, null);
            this.f15470c.getOverlay().remove(this);
            this.f15471f = false;
        }
    }
}
