package a2;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public class d implements RecyclerView.m {
    public d(ViewPager2 viewPager2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
