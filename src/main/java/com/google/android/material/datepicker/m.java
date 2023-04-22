package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public final class m<S> extends androidx.fragment.app.l {
    public static final /* synthetic */ int U0 = 0;
    public final LinkedHashSet<o<? super S>> D0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> E0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> F0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> G0 = new LinkedHashSet<>();
    public int H0;
    public d<S> I0;
    public v<S> J0;
    public com.google.android.material.datepicker.a K0;
    public MaterialCalendar<S> L0;
    public int M0;
    public CharSequence N0;
    public boolean O0;
    public int P0;
    public TextView Q0;
    public CheckableImageButton R0;
    public cb.g S0;
    public Button T0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<o<? super S>> it = m.this.D0.iterator();
            while (it.hasNext()) {
                it.next().a((S) m.this.R0().f0());
            }
            m.this.L0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = m.this.E0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            m.this.L0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class c extends u<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.u
        public void a(S s10) {
            m mVar = m.this;
            int i10 = m.U0;
            mVar.W0();
            m mVar2 = m.this;
            mVar2.T0.setEnabled(mVar2.R0().Z());
        }
    }

    public static int S0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d = y.d();
        d.set(5, 1);
        Calendar b10 = y.b(d);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean T0(Context context) {
        return U0(context, 16843277);
    }

    public static boolean U0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(za.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.l
    public final Dialog M0(Bundle bundle) {
        Context u02 = u0();
        Context u03 = u0();
        int i10 = this.H0;
        if (i10 == 0) {
            i10 = R0().X(u03);
        }
        Dialog dialog = new Dialog(u02, i10);
        Context context = dialog.getContext();
        this.O0 = T0(context);
        int c10 = za.b.c(context, R.attr.colorSurface, m.class.getCanonicalName());
        cb.g gVar = new cb.g(context, null, R.attr.materialCalendarStyle, 2132018228);
        this.S0 = gVar;
        gVar.f3929c.f3939b = new ra.a(context);
        gVar.C();
        this.S0.r(ColorStateList.valueOf(c10));
        cb.g gVar2 = this.S0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        gVar2.q(x.i.i(decorView));
        return dialog;
    }

    public final d<S> R0() {
        if (this.I0 == null) {
            this.I0 = (d) this.f2019u.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.I0;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public final void U(Bundle bundle) {
        super.U(bundle);
        if (bundle == null) {
            bundle = this.f2019u;
        }
        this.H0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.I0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.K0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.M0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.P0 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final void V0() {
        v<S> vVar;
        Context u02 = u0();
        int i10 = this.H0;
        if (i10 == 0) {
            i10 = R0().X(u02);
        }
        d<S> R0 = R0();
        com.google.android.material.datepicker.a aVar = this.K0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", R0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f7353m);
        materialCalendar.A0(bundle);
        this.L0 = materialCalendar;
        if (this.R0.isChecked()) {
            d<S> R02 = R0();
            com.google.android.material.datepicker.a aVar2 = this.K0;
            vVar = new p<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", R02);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            vVar.A0(bundle2);
        } else {
            vVar = this.L0;
        }
        this.J0 = vVar;
        W0();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(p());
        aVar3.i(R.id.mtrl_calendar_frame, this.J0, null);
        if (aVar3.f2156g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar3.f2157h = false;
        aVar3.f2072q.D(aVar3, false);
        this.J0.K0(new c());
    }

    @Override // androidx.fragment.app.Fragment
    public final View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.O0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.O0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(S0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(S0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.Q0 = textView;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.g.f(textView, 1);
        this.R0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.N0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.M0);
        }
        this.R0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.R0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, f.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], f.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.R0.setChecked(this.P0 != 0);
        n0.x.v(this.R0, null);
        X0(this.R0);
        this.R0.setOnClickListener(new n(this));
        this.T0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (R0().Z()) {
            this.T0.setEnabled(true);
        } else {
            this.T0.setEnabled(false);
        }
        this.T0.setTag("CONFIRM_BUTTON_TAG");
        this.T0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void W0() {
        String s10 = R0().s(q());
        this.Q0.setContentDescription(String.format(I(R.string.mtrl_picker_announce_current_selection), s10));
        this.Q0.setText(s10);
    }

    public final void X0(CheckableImageButton checkableImageButton) {
        this.R0.setContentDescription(this.R0.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.H0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.I0);
        a.b bVar = new a.b(this.K0);
        q qVar = this.L0.f7336r0;
        if (qVar != null) {
            bVar.f7359c = Long.valueOf(qVar.f7401t);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.d);
        q d = q.d(bVar.f7357a);
        q d10 = q.d(bVar.f7358b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f7359c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(d, d10, cVar, l10 == null ? null : q.d(l10.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.N0);
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void i0() {
        super.i0();
        Window window = N0().getWindow();
        if (this.O0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.S0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = E().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.S0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new pa.a(N0(), rect));
        }
        V0();
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void j0() {
        this.J0.f7416n0.clear();
        super.j0();
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.F0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.G0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.W;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
