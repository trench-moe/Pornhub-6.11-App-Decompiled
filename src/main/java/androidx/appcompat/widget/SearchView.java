package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements j.b {
    public static final n C0;
    public View.OnKeyListener A0;
    public TextWatcher B0;
    public final SearchAutoComplete F;
    public final View G;
    public final View H;
    public final View I;
    public final ImageView J;
    public final ImageView K;
    public final ImageView L;
    public final ImageView M;
    public final View N;
    public p O;
    public Rect P;
    public Rect Q;
    public int[] R;
    public int[] S;
    public final ImageView T;
    public final Drawable U;
    public final int V;
    public final int W;

    /* renamed from: a0  reason: collision with root package name */
    public final Intent f853a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Intent f854b0;

    /* renamed from: c0  reason: collision with root package name */
    public final CharSequence f855c0;

    /* renamed from: d0  reason: collision with root package name */
    public l f856d0;

    /* renamed from: e0  reason: collision with root package name */
    public k f857e0;

    /* renamed from: f0  reason: collision with root package name */
    public View.OnFocusChangeListener f858f0;

    /* renamed from: g0  reason: collision with root package name */
    public m f859g0;

    /* renamed from: h0  reason: collision with root package name */
    public View.OnClickListener f860h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f861i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f862j0;

    /* renamed from: k0  reason: collision with root package name */
    public r0.a f863k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f864l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f865m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f866n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f867o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f868p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f869q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f870r0;

    /* renamed from: s0  reason: collision with root package name */
    public CharSequence f871s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f872t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f873u0;

    /* renamed from: v0  reason: collision with root package name */
    public SearchableInfo f874v0;
    public Bundle w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Runnable f875x0;

    /* renamed from: y0  reason: collision with root package name */
    public Runnable f876y0;

    /* renamed from: z0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f877z0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int n;

        /* renamed from: t  reason: collision with root package name */
        public SearchView f878t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f879u;

        /* renamed from: w  reason: collision with root package name */
        public final Runnable f880w;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f879u) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f879u = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f880w = new a();
            this.n = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 < 600) {
                    return (i10 < 640 || i11 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.C0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f894c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.n <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f879u) {
                removeCallbacks(this.f880w);
                post(this.f880w);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f878t;
            searchView.B(searchView.f862j0);
            searchView.post(searchView.f875x0);
            if (searchView.F.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f878t.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f878t.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f879u = true;
                Context context = getContext();
                n nVar = SearchView.C0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f879u = false;
                removeCallbacks(this.f880w);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f879u = true;
            } else {
                this.f879u = false;
                removeCallbacks(this.f880w);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f878t = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.n = i10;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.F.getText();
            searchView.f871s0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.A(z10);
            searchView.C(!z10);
            searchView.w();
            searchView.z();
            if (searchView.f856d0 != null && !TextUtils.equals(charSequence, searchView.f870r0)) {
                searchView.f856d0.a(charSequence.toString());
            }
            searchView.f870r0 = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.x();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.a aVar = SearchView.this.f863k0;
            if (aVar instanceof j0) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f858f0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView searchView = SearchView.this;
            if (searchView.N.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.H.getPaddingLeft();
                Rect rect = new Rect();
                boolean b10 = x0.b(searchView);
                int dimensionPixelSize = searchView.f861i0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.F.getDropDownBackground().getPadding(rect);
                searchView.F.setDropDownHorizontalOffset(b10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.F.setDropDownWidth((((searchView.N.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.J) {
                searchView.t();
            } else if (view == searchView.L) {
                searchView.p();
            } else if (view == searchView.K) {
                searchView.u();
            } else if (view != searchView.M) {
                if (view == searchView.F) {
                    searchView.n();
                }
            } else {
                SearchableInfo searchableInfo = searchView.f874v0;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m(searchView.f854b0, searchableInfo));
                            return;
                        }
                        return;
                    }
                    Intent intent = new Intent(searchView.f853a0);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
            r11 = 0;
         */
        @Override // android.view.View.OnKeyListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onKey(android.view.View r10, int r11, android.view.KeyEvent r12) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.g.onKey(android.view.View, int, android.view.KeyEvent):boolean");
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.u();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.q(i10);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.r(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i10);

        boolean b(int i10);
    }

    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f892a;

        /* renamed from: b  reason: collision with root package name */
        public Method f893b;

        /* renamed from: c  reason: collision with root package name */
        public Method f894c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            this.f892a = null;
            this.f893b = null;
            this.f894c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f892a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f893b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f894c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o extends s0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public boolean f895j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new o[i10];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f895j = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("SearchView.SavedState{");
            m10.append(Integer.toHexString(System.identityHashCode(this)));
            m10.append(" isIconified=");
            m10.append(this.f895j);
            m10.append("}");
            return m10.toString();
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeValue(Boolean.valueOf(this.f895j));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f896a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f897b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f898c;
        public final Rect d;

        /* renamed from: e  reason: collision with root package name */
        public final int f899e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f900f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f899e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f897b = new Rect();
            this.d = new Rect();
            this.f898c = new Rect();
            a(rect, rect2);
            this.f896a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f897b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i10 = this.f899e;
            rect3.inset(-i10, -i10);
            this.f898c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f900f;
                    if (z11 && !this.d.contains(x10, y)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f900f;
                    this.f900f = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f897b.contains(x10, y)) {
                    this.f900f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (!z10 || this.f898c.contains(x10, y)) {
                    Rect rect = this.f898c;
                    motionEvent.setLocation(x10 - rect.left, y - rect.top);
                } else {
                    motionEvent.setLocation(this.f896a.getWidth() / 2, this.f896a.getHeight() / 2);
                }
                return this.f896a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        C0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new int[2];
        this.S = new int[2];
        this.f875x0 = new b();
        this.f876y0 = new c();
        this.f877z0 = new WeakHashMap<>();
        f fVar = new f();
        this.A0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.B0 = new a();
        int[] iArr = b7.k.Q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        p0 p0Var = new p0(context, obtainStyledAttributes);
        n0.x.u(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        LayoutInflater.from(context).inflate(p0Var.m(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.F = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.G = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.H = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.I = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.J = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.K = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.L = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.M = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.T = imageView5;
        x.d.q(findViewById, p0Var.g(10));
        x.d.q(findViewById2, p0Var.g(14));
        imageView.setImageDrawable(p0Var.g(13));
        imageView2.setImageDrawable(p0Var.g(7));
        imageView3.setImageDrawable(p0Var.g(4));
        imageView4.setImageDrawable(p0Var.g(16));
        imageView5.setImageDrawable(p0Var.g(13));
        this.U = p0Var.g(12);
        t0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.V = p0Var.m(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.W = p0Var.m(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.B0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.A0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(p0Var.a(8, true));
        int f10 = p0Var.f(1, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.f855c0 = p0Var.o(6);
        this.f865m0 = p0Var.o(11);
        int j10 = p0Var.j(3, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = p0Var.j(2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(p0Var.a(0, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f853a0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f854b0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.N = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        B(this.f861i0);
        y();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.F.setText(charSequence);
        this.F.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A(boolean z10) {
        boolean z11 = this.f864l0;
        int i10 = 0;
        if (z11) {
            if (((z11 || this.f869q0) && !this.f862j0) && hasFocus()) {
                if (!z10) {
                    if (!this.f869q0) {
                        this.K.setVisibility(i10);
                    }
                }
                this.K.setVisibility(i10);
            }
        }
        i10 = 8;
        this.K.setVisibility(i10);
    }

    public final void B(boolean z10) {
        this.f862j0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.F.getText());
        this.J.setVisibility(i11);
        A(z11);
        this.G.setVisibility(z10 ? 8 : 0);
        this.T.setVisibility((this.T.getDrawable() == null || this.f861i0) ? 8 : 8);
        w();
        C(!z11);
        z();
    }

    public final void C(boolean z10) {
        int i10 = 8;
        if (this.f869q0 && !this.f862j0 && z10) {
            this.K.setVisibility(8);
            i10 = 0;
        }
        this.M.setVisibility(i10);
    }

    @Override // j.b
    public void c() {
        if (this.f872t0) {
            return;
        }
        this.f872t0 = true;
        int imeOptions = this.F.getImeOptions();
        this.f873u0 = imeOptions;
        this.F.setImeOptions(imeOptions | 33554432);
        this.F.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f867o0 = true;
        super.clearFocus();
        this.F.clearFocus();
        this.F.setImeVisibility(false);
        this.f867o0 = false;
    }

    @Override // j.b
    public void e() {
        v(BuildConfig.FLAVOR, false);
        clearFocus();
        B(true);
        this.F.setImeOptions(this.f873u0);
        this.f872t0 = false;
    }

    public int getImeOptions() {
        return this.F.getImeOptions();
    }

    public int getInputType() {
        return this.F.getInputType();
    }

    public int getMaxWidth() {
        return this.f868p0;
    }

    public CharSequence getQuery() {
        return this.F.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f865m0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f874v0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f855c0 : getContext().getText(this.f874v0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.W;
    }

    public int getSuggestionRowLayout() {
        return this.V;
    }

    public r0.a getSuggestionsAdapter() {
        return this.f863k0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f871s0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.w0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f874v0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.w0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.F.refreshAutoCompleteResults();
            return;
        }
        n nVar = C0;
        SearchAutoComplete searchAutoComplete = this.F;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.f892a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = C0;
        SearchAutoComplete searchAutoComplete2 = this.F;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.f893b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void o(int i10, String str, String str2) {
        getContext().startActivity(l("android.intent.action.SEARCH", null, null, str2, i10, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f875x0);
        post(this.f876y0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.F;
            Rect rect = this.P;
            searchAutoComplete.getLocationInWindow(this.R);
            getLocationInWindow(this.S);
            int[] iArr = this.R;
            int i14 = iArr[1];
            int[] iArr2 = this.S;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.Q;
            Rect rect3 = this.P;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            p pVar = this.O;
            if (pVar == null) {
                p pVar2 = new p(this.Q, this.P, this.F);
                this.O = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.Q, this.P);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f862j0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f868p0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f868p0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f868p0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f14775c);
        B(oVar.f895j);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f895j = this.f862j0;
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f875x0);
    }

    public void p() {
        if (!TextUtils.isEmpty(this.F.getText())) {
            this.F.setText(BuildConfig.FLAVOR);
            this.F.requestFocus();
            this.F.setImeVisibility(true);
        } else if (this.f861i0) {
            k kVar = this.f857e0;
            if (kVar != null) {
                if (!kVar.a()) {
                }
            }
            clearFocus();
            B(true);
        }
    }

    public boolean q(int i10) {
        int i11;
        String h10;
        m mVar = this.f859g0;
        if (mVar == null || !mVar.b(i10)) {
            Cursor cursor = this.f863k0.f14612j;
            if (cursor != null && cursor.moveToPosition(i10)) {
                Intent intent = null;
                try {
                    int i12 = j0.O;
                    String h11 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (h11 == null) {
                        h11 = this.f874v0.getSuggestIntentAction();
                    }
                    if (h11 == null) {
                        h11 = "android.intent.action.SEARCH";
                    }
                    String str = h11;
                    String h12 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (h12 == null) {
                        h12 = this.f874v0.getSuggestIntentData();
                    }
                    if (h12 != null && (h10 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        h12 = h12 + "/" + Uri.encode(h10);
                    }
                    intent = l(str, h12 == null ? intent : Uri.parse(h12), j0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), j0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException e10) {
                    try {
                        i11 = cursor.getPosition();
                    } catch (RuntimeException unused) {
                        i11 = -1;
                    }
                    Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
                }
                if (intent != null) {
                    try {
                        getContext().startActivity(intent);
                    } catch (RuntimeException e11) {
                        Log.e("SearchView", "Failed launch activity: " + intent, e11);
                    }
                }
            }
            this.F.setImeVisibility(false);
            this.F.dismissDropDown();
            return true;
        }
        return false;
    }

    public boolean r(int i10) {
        m mVar = this.f859g0;
        if (mVar == null || !mVar.a(i10)) {
            Editable text = this.F.getText();
            Cursor cursor = this.f863k0.f14612j;
            if (cursor != null) {
                if (cursor.moveToPosition(i10)) {
                    CharSequence c10 = this.f863k0.c(cursor);
                    if (c10 != null) {
                        setQuery(c10);
                    } else {
                        setQuery(text);
                    }
                } else {
                    setQuery(text);
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (!this.f867o0 && isFocusable()) {
            if (this.f862j0) {
                return super.requestFocus(i10, rect);
            }
            boolean requestFocus = this.F.requestFocus(i10, rect);
            if (requestFocus) {
                B(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void s(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.w0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            p();
        } else {
            t();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f861i0 == z10) {
            return;
        }
        this.f861i0 = z10;
        B(z10);
        y();
    }

    public void setImeOptions(int i10) {
        this.F.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.F.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f868p0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f857e0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f858f0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f856d0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f860h0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f859g0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f865m0 = charSequence;
        y();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f866n0 = z10;
        r0.a aVar = this.f863k0;
        if (aVar instanceof j0) {
            ((j0) aVar).G = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r11) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f864l0 = z10;
        B(this.f862j0);
    }

    public void setSuggestionsAdapter(r0.a aVar) {
        this.f863k0 = aVar;
        this.F.setAdapter(aVar);
    }

    public void t() {
        B(false);
        this.F.requestFocus();
        this.F.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f860h0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void u() {
        l lVar;
        Editable text = this.F.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0 && ((lVar = this.f856d0) == null || !lVar.b(text.toString()))) {
            if (this.f874v0 != null) {
                o(0, null, text.toString());
            }
            this.F.setImeVisibility(false);
            this.F.dismissDropDown();
        }
    }

    public void v(CharSequence charSequence, boolean z10) {
        this.F.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.F;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f871s0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            u();
        }
    }

    public final void w() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.F.getText());
        int i10 = 0;
        if (!z11 && (!this.f861i0 || this.f872t0)) {
            z10 = false;
        }
        ImageView imageView = this.L;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.L.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void x() {
        int[] iArr = this.F.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.H.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.I.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void y() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.F;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        if (this.f861i0) {
            if (this.U == null) {
                searchAutoComplete.setHint(queryHint);
            }
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.U.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.U), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r6.M.getVisibility() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r6 = this;
            boolean r0 = r6.f864l0
            r2 = 0
            r1 = r2
            if (r0 != 0) goto Ld
            r3 = 5
            boolean r0 = r6.f869q0
            r3 = 6
            if (r0 == 0) goto L14
            r3 = 5
        Ld:
            boolean r0 = r6.f862j0
            r5 = 7
            if (r0 != 0) goto L14
            r0 = 1
            goto L16
        L14:
            r5 = 7
            r0 = 0
        L16:
            if (r0 == 0) goto L2d
            android.widget.ImageView r0 = r6.K
            r3 = 3
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L2f
            r5 = 1
            android.widget.ImageView r0 = r6.M
            r3 = 4
            int r2 = r0.getVisibility()
            r0 = r2
            if (r0 != 0) goto L2d
            goto L30
        L2d:
            r1 = 8
        L2f:
            r4 = 5
        L30:
            android.view.View r0 = r6.I
            r3 = 2
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.z():void");
    }
}
