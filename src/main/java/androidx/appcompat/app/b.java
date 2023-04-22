package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.app.pornhub.R;
import e.m;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class b extends m {

    /* renamed from: j  reason: collision with root package name */
    public final AlertController f495j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f496a;

        /* renamed from: b  reason: collision with root package name */
        public final int f497b;

        public a(Context context) {
            this(context, b.e(context, 0));
        }

        public a(Context context, int i10) {
            this.f496a = new AlertController.b(new ContextThemeWrapper(context, b.e(context, i10)));
            this.f497b = i10;
        }

        public a a(int i10) {
            AlertController.b bVar = this.f496a;
            bVar.f480f = bVar.f476a.getText(i10);
            return this;
        }

        public a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f496a;
            bVar.f483i = charSequence;
            bVar.f484j = onClickListener;
            return this;
        }

        public a c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f496a;
            bVar.f481g = charSequence;
            bVar.f482h = onClickListener;
            return this;
        }

        public b create() {
            b bVar = new b(this.f496a.f476a, this.f497b);
            AlertController.b bVar2 = this.f496a;
            AlertController alertController = bVar.f495j;
            View view = bVar2.f479e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar2.d;
                if (charSequence != null) {
                    alertController.f453e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f478c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f480f;
            if (charSequence2 != null) {
                alertController.f454f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar2.f481g;
            if (charSequence3 != null) {
                alertController.e(-1, charSequence3, bVar2.f482h, null, null);
            }
            CharSequence charSequence4 = bVar2.f483i;
            if (charSequence4 != null) {
                alertController.e(-2, charSequence4, bVar2.f484j, null, null);
            }
            CharSequence charSequence5 = bVar2.f485k;
            if (charSequence5 != null) {
                alertController.e(-3, charSequence5, bVar2.f486l, null, null);
            }
            if (bVar2.n != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f477b.inflate(alertController.L, (ViewGroup) null);
                int i10 = bVar2.f490q ? alertController.N : alertController.O;
                ListAdapter listAdapter = bVar2.n;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f476a, i10, 16908308, null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar2.f491r;
                if (bVar2.f488o != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar2, alertController));
                }
                if (bVar2.f490q) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f455g = recycleListView;
            }
            View view2 = bVar2.f489p;
            if (view2 != null) {
                alertController.f456h = view2;
                alertController.f457i = 0;
                alertController.n = false;
            }
            Objects.requireNonNull(this.f496a);
            bVar.setCancelable(true);
            Objects.requireNonNull(this.f496a);
            bVar.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.f496a);
            bVar.setOnCancelListener(null);
            Objects.requireNonNull(this.f496a);
            bVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f496a.f487m;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a d(int i10) {
            AlertController.b bVar = this.f496a;
            bVar.d = bVar.f476a.getText(i10);
            return this;
        }

        public Context getContext() {
            return this.f496a.f476a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f496a;
            bVar.f483i = bVar.f476a.getText(i10);
            this.f496a.f484j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f496a;
            bVar.f481g = bVar.f476a.getText(i10);
            this.f496a.f482h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f496a.d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f496a.f489p = view;
            return this;
        }
    }

    public b(Context context, int i10) {
        super(context, e(context, i10));
        this.f495j = new AlertController(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button d(int i10) {
        AlertController alertController = this.f495j;
        Objects.requireNonNull(alertController);
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 != -1) {
                    return null;
                }
                return alertController.f462o;
            }
            return alertController.f466s;
        }
        return alertController.f470w;
    }

    @Override // e.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z10;
        View view;
        ListAdapter listAdapter;
        View view2;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f495j;
        alertController.f451b.setContentView(alertController.K == 0 ? alertController.J : alertController.J);
        View findViewById2 = alertController.f452c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view3 = alertController.f456h;
        if (view3 == null) {
            view3 = alertController.f457i != 0 ? LayoutInflater.from(alertController.f450a).inflate(alertController.f457i, viewGroup, false) : null;
        }
        boolean z11 = view3 != null;
        if (!z11 || !AlertController.a(view3)) {
            alertController.f452c.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) alertController.f452c.findViewById(R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.f458j, alertController.f459k, alertController.f460l, alertController.f461m);
            }
            if (alertController.f455g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d = alertController.d(findViewById6, findViewById3);
        ViewGroup d10 = alertController.d(findViewById7, findViewById4);
        ViewGroup d11 = alertController.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f452c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d10.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f454f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f455g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f455g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d10.setVisibility(8);
                }
            }
        }
        Button button = (Button) d11.findViewById(16908313);
        alertController.f462o = button;
        button.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f463p) && alertController.f465r == null) {
            alertController.f462o.setVisibility(8);
            z10 = false;
        } else {
            alertController.f462o.setText(alertController.f463p);
            Drawable drawable = alertController.f465r;
            if (drawable != null) {
                int i10 = alertController.d;
                drawable.setBounds(0, 0, i10, i10);
                alertController.f462o.setCompoundDrawables(alertController.f465r, null, null, null);
            }
            alertController.f462o.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) d11.findViewById(16908314);
        alertController.f466s = button2;
        button2.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f467t) && alertController.f469v == null) {
            alertController.f466s.setVisibility(8);
        } else {
            alertController.f466s.setText(alertController.f467t);
            Drawable drawable2 = alertController.f469v;
            if (drawable2 != null) {
                int i11 = alertController.d;
                drawable2.setBounds(0, 0, i11, i11);
                alertController.f466s.setCompoundDrawables(alertController.f469v, null, null, null);
            }
            alertController.f466s.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) d11.findViewById(16908315);
        alertController.f470w = button3;
        button3.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f471x) && alertController.f472z == null) {
            alertController.f470w.setVisibility(8);
            view = null;
        } else {
            alertController.f470w.setText(alertController.f471x);
            Drawable drawable3 = alertController.f472z;
            if (drawable3 != null) {
                int i12 = alertController.d;
                drawable3.setBounds(0, 0, i12, i12);
                view = null;
                alertController.f470w.setCompoundDrawables(alertController.f472z, null, null, null);
            } else {
                view = null;
            }
            alertController.f470w.setVisibility(0);
            z10 |= true;
        }
        Context context = alertController.f450a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z10) {
                alertController.b(alertController.f462o);
            } else if (z10) {
                alertController.b(alertController.f466s);
            } else if (z10) {
                alertController.b(alertController.f470w);
            }
        }
        if (!(z10)) {
            d11.setVisibility(8);
        }
        if (alertController.G != null) {
            d.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f452c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f452c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f453e)) && alertController.P) {
                TextView textView2 = (TextView) alertController.f452c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f453e);
                int i13 = alertController.B;
                if (i13 != 0) {
                    alertController.D.setImageResource(i13);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                alertController.f452c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                d.setVisibility(8);
            }
        }
        boolean z12 = viewGroup.getVisibility() != 8;
        int i14 = (d == null || d.getVisibility() == 8) ? 0 : 1;
        boolean z13 = d11.getVisibility() != 8;
        if (!z13 && (findViewById = d10.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i14 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f454f == null && alertController.f455g == null) ? view : d.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = d10.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f455g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z13 || i14 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i14 != 0 ? recycleListView.getPaddingTop() : recycleListView.f473c, recycleListView.getPaddingRight(), z13 ? recycleListView.getPaddingBottom() : recycleListView.f474f);
            }
        }
        if (!z12) {
            View view4 = alertController.f455g;
            if (view4 == null) {
                view4 = alertController.A;
            }
            if (view4 != null) {
                int i15 = i14 | (z13 ? 2 : 0);
                View findViewById11 = alertController.f452c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f452c.findViewById(R.id.scrollIndicatorDown);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 23) {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    if (i16 >= 23) {
                        x.j.d(view4, i15, 3);
                    }
                    if (findViewById11 != null) {
                        d10.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        d10.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i15 & 1) == 0) {
                        d10.removeView(findViewById11);
                        findViewById11 = view;
                    }
                    if (findViewById12 == null || (i15 & 2) != 0) {
                        view2 = findViewById12;
                    } else {
                        d10.removeView(findViewById12);
                        view2 = view;
                    }
                    if (findViewById11 != null || view2 != null) {
                        if (alertController.f454f != null) {
                            alertController.A.setOnScrollChangeListener(new e.a(alertController, findViewById11, view2));
                            alertController.A.post(new e.b(alertController, findViewById11, view2));
                        } else {
                            ListView listView2 = alertController.f455g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new e.c(alertController, findViewById11, view2));
                                alertController.f455g.post(new e.d(alertController, findViewById11, view2));
                            } else {
                                if (findViewById11 != null) {
                                    d10.removeView(findViewById11);
                                }
                                if (view2 != null) {
                                    d10.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f455g;
        if (listView3 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i17 = alertController.I;
        if (i17 > -1) {
            listView3.setItemChecked(i17, true);
            listView3.setSelection(i17);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f495j.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f495j.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // e.m, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f495j;
        alertController.f453e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
