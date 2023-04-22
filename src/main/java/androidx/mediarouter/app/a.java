package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.app.pornhub.R;
import j1.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends e.m {
    public long A;
    public final Handler B;

    /* renamed from: j  reason: collision with root package name */
    public final j1.l f2471j;

    /* renamed from: m  reason: collision with root package name */
    public final b f2472m;
    public TextView n;

    /* renamed from: t  reason: collision with root package name */
    public j1.k f2473t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<l.i> f2474u;

    /* renamed from: w  reason: collision with root package name */
    public c f2475w;
    public ListView y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2476z;

    /* renamed from: androidx.mediarouter.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0033a extends Handler {
        public HandlerC0033a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            a aVar = a.this;
            Objects.requireNonNull(aVar);
            aVar.A = SystemClock.uptimeMillis();
            aVar.f2474u.clear();
            aVar.f2474u.addAll((List) message.obj);
            aVar.f2475w.notifyDataSetChanged();
        }
    }

    /* loaded from: classes.dex */
    public final class b extends l.b {
        public b() {
        }

        @Override // j1.l.b
        public void d(j1.l lVar, l.i iVar) {
            a.this.d();
        }

        @Override // j1.l.b
        public void e(j1.l lVar, l.i iVar) {
            a.this.d();
        }

        @Override // j1.l.b
        public void f(j1.l lVar, l.i iVar) {
            a.this.d();
        }

        @Override // j1.l.b
        public void g(j1.l lVar, l.i iVar) {
            a.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ArrayAdapter<l.i> implements AdapterView.OnItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final LayoutInflater f2479c;

        /* renamed from: f  reason: collision with root package name */
        public final Drawable f2480f;

        /* renamed from: j  reason: collision with root package name */
        public final Drawable f2481j;

        /* renamed from: m  reason: collision with root package name */
        public final Drawable f2482m;
        public final Drawable n;

        public c(Context context, List<l.i> list) {
            super(context, 0, list);
            this.f2479c = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.f2480f = obtainStyledAttributes.getDrawable(0);
            this.f2481j = obtainStyledAttributes.getDrawable(1);
            this.f2482m = obtainStyledAttributes.getDrawable(2);
            this.n = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
            /*
                Method dump skipped, instructions count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return getItem(i10).f11335g;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            l.i item = getItem(i10);
            if (item.f11335g) {
                ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
                if (imageView != null && progressBar != null) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                item.m();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparator<l.i> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f2483c = new d();

        @Override // java.util.Comparator
        public int compare(l.i iVar, l.i iVar2) {
            return iVar.d.compareToIgnoreCase(iVar2.d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.p.a(r2, r0, r0)
            int r0 = androidx.mediarouter.app.p.b(r2)
            r1.<init>(r2, r0)
            j1.k r2 = j1.k.f11274c
            r1.f2473t = r2
            androidx.mediarouter.app.a$a r2 = new androidx.mediarouter.app.a$a
            r2.<init>()
            r1.B = r2
            android.content.Context r2 = r1.getContext()
            j1.l r2 = j1.l.d(r2)
            r1.f2471j = r2
            androidx.mediarouter.app.a$b r2 = new androidx.mediarouter.app.a$b
            r2.<init>()
            r1.f2472m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.<init>(android.content.Context):void");
    }

    public void d() {
        if (this.f2476z) {
            ArrayList arrayList = new ArrayList(this.f2471j.f());
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                boolean z10 = true;
                if (size <= 0) {
                    break;
                }
                l.i iVar = (l.i) arrayList.get(i10);
                if (iVar.e() || !iVar.f11335g || !iVar.i(this.f2473t)) {
                    z10 = false;
                }
                if (!z10) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, d.f2483c);
            if (SystemClock.uptimeMillis() - this.A >= 300) {
                this.A = SystemClock.uptimeMillis();
                this.f2474u.clear();
                this.f2474u.addAll(arrayList);
                this.f2475w.notifyDataSetChanged();
                return;
            }
            this.B.removeMessages(1);
            Handler handler = this.B;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.A + 300);
        }
    }

    public void e(j1.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!this.f2473t.equals(kVar)) {
            this.f2473t = kVar;
            if (this.f2476z) {
                this.f2471j.i(this.f2472m);
                this.f2471j.a(kVar, this.f2472m, 1);
            }
            d();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2476z = true;
        this.f2471j.a(this.f2473t, this.f2472m, 1);
        d();
    }

    @Override // e.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.f2474u = new ArrayList<>();
        this.f2475w = new c(getContext(), this.f2474u);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.y = listView;
        listView.setAdapter((ListAdapter) this.f2475w);
        this.y.setOnItemClickListener(this.f2475w);
        this.y.setEmptyView(findViewById(16908292));
        this.n = (TextView) findViewById(R.id.mr_chooser_title);
        getWindow().setLayout(k.a(getContext()), -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f2476z = false;
        this.f2471j.i(this.f2472m);
        this.B.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // e.m, android.app.Dialog
    public void setTitle(int i10) {
        this.n.setText(i10);
    }

    @Override // e.m, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.n.setText(charSequence);
    }
}
