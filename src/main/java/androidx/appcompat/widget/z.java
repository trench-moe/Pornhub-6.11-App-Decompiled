package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public class z implements AdapterView.OnItemSelectedListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f1150c;

    public z(ListPopupWindow listPopupWindow) {
        this.f1150c = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        w wVar;
        if (i10 == -1 || (wVar = this.f1150c.f842j) == null) {
            return;
        }
        wVar.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
