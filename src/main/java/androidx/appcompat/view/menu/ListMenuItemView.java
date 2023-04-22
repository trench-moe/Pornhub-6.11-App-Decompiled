package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.p0;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {
    public int A;
    public Context B;
    public boolean C;
    public Drawable D;
    public boolean E;
    public LayoutInflater F;
    public boolean G;

    /* renamed from: c  reason: collision with root package name */
    public g f598c;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f599f;

    /* renamed from: j  reason: collision with root package name */
    public RadioButton f600j;

    /* renamed from: m  reason: collision with root package name */
    public TextView f601m;
    public CheckBox n;

    /* renamed from: t  reason: collision with root package name */
    public TextView f602t;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f603u;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f604w;
    public LinearLayout y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f605z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        p0 r10 = p0.r(getContext(), attributeSet, b7.k.N, i10, 0);
        this.f605z = r10.g(5);
        this.A = r10.m(1, -1);
        this.C = r10.a(7, false);
        this.B = context;
        this.D = r10.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.E = obtainStyledAttributes.hasValue(0);
        r10.f1055b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.F == null) {
            this.F = LayoutInflater.from(getContext());
        }
        return this.F;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f603u;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.n = checkBox;
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f604w;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f604w.getLayoutParams();
            rect.top = this.f604w.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f600j = radioButton;
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i10) {
        String sb2;
        this.f598c = gVar;
        int i11 = 0;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.f670e);
        setCheckable(gVar.isCheckable());
        boolean n = gVar.n();
        gVar.e();
        if (!n || !this.f598c.n()) {
            i11 = 8;
        }
        if (i11 == 0) {
            TextView textView = this.f602t;
            g gVar2 = this.f598c;
            char e10 = gVar2.e();
            if (e10 == 0) {
                sb2 = BuildConfig.FLAVOR;
            } else {
                Resources resources = gVar2.n.f642a.getResources();
                StringBuilder sb3 = new StringBuilder();
                if (ViewConfiguration.get(gVar2.n.f642a).hasPermanentMenuKey()) {
                    sb3.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i12 = gVar2.n.n() ? gVar2.f676k : gVar2.f674i;
                g.c(sb3, i12, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                g.c(sb3, i12, ConstantsKt.DEFAULT_BLOCK_SIZE, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                g.c(sb3, i12, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                g.c(sb3, i12, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                g.c(sb3, i12, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                g.c(sb3, i12, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e10 == '\b') {
                    sb3.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e10 == '\n') {
                    sb3.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e10 != ' ') {
                    sb3.append(e10);
                } else {
                    sb3.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                sb2 = sb3.toString();
            }
            textView.setText(sb2);
        }
        if (this.f602t.getVisibility() != i11) {
            this.f602t.setVisibility(i11);
        }
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.f681q);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f598c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f605z;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f601m = textView;
        int i10 = this.A;
        if (i10 != -1) {
            textView.setTextAppearance(this.B, i10);
        }
        this.f602t = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f603u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.D);
        }
        this.f604w = (ImageView) findViewById(R.id.group_divider);
        this.y = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f599f != null && this.C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f599f.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f600j == null && this.n == null) {
            return;
        }
        if (this.f598c.h()) {
            if (this.f600j == null) {
                b();
            }
            compoundButton = this.f600j;
            compoundButton2 = this.n;
        } else {
            if (this.n == null) {
                a();
            }
            compoundButton = this.n;
            compoundButton2 = this.f600j;
        }
        if (z10) {
            compoundButton.setChecked(this.f598c.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.n;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f600j;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f598c.h()) {
            if (this.f600j == null) {
                b();
            }
            compoundButton = this.f600j;
        } else {
            if (this.n == null) {
                a();
            }
            compoundButton = this.n;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.G = z10;
        this.C = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f604w;
        if (imageView != null) {
            imageView.setVisibility((this.E || !z10) ? 8 : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setIcon(android.graphics.drawable.Drawable r9) {
        /*
            r8 = this;
            androidx.appcompat.view.menu.g r0 = r8.f598c
            r5 = 4
            androidx.appcompat.view.menu.e r0 = r0.n
            r6 = 5
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r8.G
            r1 = 0
            if (r0 == 0) goto L11
            r4 = 1
            r0 = r4
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L1b
            r7 = 5
            boolean r2 = r8.C
            if (r2 != 0) goto L1b
            r7 = 3
            return
        L1b:
            r5 = 7
            android.widget.ImageView r2 = r8.f599f
            r7 = 2
            if (r2 != 0) goto L29
            if (r9 != 0) goto L29
            boolean r3 = r8.C
            if (r3 != 0) goto L29
            r6 = 1
            return
        L29:
            if (r2 != 0) goto L47
            android.view.LayoutInflater r2 = r8.getInflater()
            r3 = 2131558415(0x7f0d000f, float:1.8742145E38)
            android.view.View r2 = r2.inflate(r3, r8, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 4
            r8.f599f = r2
            android.widget.LinearLayout r3 = r8.y
            if (r3 == 0) goto L44
            r6 = 7
            r3.addView(r2, r1)
            goto L48
        L44:
            r8.addView(r2, r1)
        L47:
            r7 = 1
        L48:
            if (r9 != 0) goto L5c
            r7 = 6
            boolean r2 = r8.C
            r7 = 2
            if (r2 == 0) goto L52
            r6 = 7
            goto L5d
        L52:
            r7 = 2
            android.widget.ImageView r9 = r8.f599f
            r0 = 8
            r5 = 7
            r9.setVisibility(r0)
            goto L79
        L5c:
            r6 = 2
        L5d:
            android.widget.ImageView r2 = r8.f599f
            r7 = 3
            if (r0 == 0) goto L64
            r7 = 1
            goto L65
        L64:
            r9 = 0
        L65:
            r2.setImageDrawable(r9)
            android.widget.ImageView r9 = r8.f599f
            r6 = 4
            int r4 = r9.getVisibility()
            r9 = r4
            if (r9 == 0) goto L78
            android.widget.ImageView r9 = r8.f599f
            r9.setVisibility(r1)
            r5 = 2
        L78:
            r5 = 7
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setIcon(android.graphics.drawable.Drawable):void");
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f601m.getVisibility() != 8) {
                this.f601m.setVisibility(8);
                return;
            }
            return;
        }
        this.f601m.setText(charSequence);
        if (this.f601m.getVisibility() != 0) {
            this.f601m.setVisibility(0);
        }
    }
}
