package ga;

import android.util.Property;
import android.view.ViewGroup;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public class c extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f9891a = new c("childrenAlpha");

    public c(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(ViewGroup viewGroup, Float f10) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f10.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup2.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
