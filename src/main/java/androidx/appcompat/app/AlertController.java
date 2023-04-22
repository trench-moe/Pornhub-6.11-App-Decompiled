package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b7.k;
import com.app.pornhub.R;
import e.m;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;

    /* renamed from: a  reason: collision with root package name */
    public final Context f450a;

    /* renamed from: b  reason: collision with root package name */
    public final m f451b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f452c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f453e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f454f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f455g;

    /* renamed from: h  reason: collision with root package name */
    public View f456h;

    /* renamed from: i  reason: collision with root package name */
    public int f457i;

    /* renamed from: j  reason: collision with root package name */
    public int f458j;

    /* renamed from: k  reason: collision with root package name */
    public int f459k;

    /* renamed from: l  reason: collision with root package name */
    public int f460l;

    /* renamed from: m  reason: collision with root package name */
    public int f461m;

    /* renamed from: o  reason: collision with root package name */
    public Button f462o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f463p;

    /* renamed from: q  reason: collision with root package name */
    public Message f464q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f465r;

    /* renamed from: s  reason: collision with root package name */
    public Button f466s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f467t;

    /* renamed from: u  reason: collision with root package name */
    public Message f468u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f469v;

    /* renamed from: w  reason: collision with root package name */
    public Button f470w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f471x;
    public Message y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f472z;
    public boolean n = false;
    public int B = 0;
    public int I = -1;
    public final View.OnClickListener R = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: c  reason: collision with root package name */
        public final int f473c;

        /* renamed from: f  reason: collision with root package name */
        public final int f474f;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.P);
            this.f474f = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f473c = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f462o || (message3 = alertController.f464q) == null) ? (view != alertController.f466s || (message2 = alertController.f468u) == null) ? (view != alertController.f470w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.Q.obtainMessage(1, alertController2.f451b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f476a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f477b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f478c;
        public CharSequence d;

        /* renamed from: e  reason: collision with root package name */
        public View f479e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f480f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f481g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f482h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f483i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f484j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f485k;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnClickListener f486l;

        /* renamed from: m  reason: collision with root package name */
        public DialogInterface.OnKeyListener f487m;
        public ListAdapter n;

        /* renamed from: o  reason: collision with root package name */
        public DialogInterface.OnClickListener f488o;

        /* renamed from: p  reason: collision with root package name */
        public View f489p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f490q;

        /* renamed from: r  reason: collision with root package name */
        public int f491r = -1;

        public b(Context context) {
            this.f476a = context;
            this.f477b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f492a;

        public c(DialogInterface dialogInterface) {
            this.f492a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f492a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, m mVar, Window window) {
        this.f450a = context;
        this.f451b = mVar;
        this.f452c = window;
        this.Q = new c(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, k.A, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        mVar.c(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        int i10 = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i10 = 0;
            }
            view3.setVisibility(i10);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void e(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.Q.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f471x = charSequence;
            this.y = obtainMessage;
            this.f472z = null;
        } else if (i10 == -2) {
            this.f467t = charSequence;
            this.f468u = obtainMessage;
            this.f469v = null;
        } else if (i10 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f463p = charSequence;
            this.f464q = obtainMessage;
            this.f465r = null;
        }
    }
}
