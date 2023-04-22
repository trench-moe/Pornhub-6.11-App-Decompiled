package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import j1.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends e.m {
    public l.i A;
    public long B;
    public long C;
    public final Handler D;

    /* renamed from: j  reason: collision with root package name */
    public final j1.l f2543j;

    /* renamed from: m  reason: collision with root package name */
    public final c f2544m;
    public Context n;

    /* renamed from: t  reason: collision with root package name */
    public j1.k f2545t;

    /* renamed from: u  reason: collision with root package name */
    public List<l.i> f2546u;

    /* renamed from: w  reason: collision with root package name */
    public d f2547w;
    public RecyclerView y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2548z;

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            l lVar = l.this;
            Objects.requireNonNull(lVar);
            lVar.C = SystemClock.uptimeMillis();
            lVar.f2546u.clear();
            lVar.f2546u.addAll((List) message.obj);
            lVar.f2547w.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public final class c extends l.b {
        public c() {
        }

        @Override // j1.l.b
        public void d(j1.l lVar, l.i iVar) {
            l.this.d();
        }

        @Override // j1.l.b
        public void e(j1.l lVar, l.i iVar) {
            l.this.d();
        }

        @Override // j1.l.b
        public void f(j1.l lVar, l.i iVar) {
            l.this.d();
        }

        @Override // j1.l.b
        public void g(j1.l lVar, l.i iVar) {
            l.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public final class d extends RecyclerView.Adapter<RecyclerView.z> {
        public final ArrayList<b> d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public final LayoutInflater f2552e;

        /* renamed from: f  reason: collision with root package name */
        public final Drawable f2553f;

        /* renamed from: g  reason: collision with root package name */
        public final Drawable f2554g;

        /* renamed from: h  reason: collision with root package name */
        public final Drawable f2555h;

        /* renamed from: i  reason: collision with root package name */
        public final Drawable f2556i;

        /* loaded from: classes.dex */
        public class a extends RecyclerView.z {

            /* renamed from: u  reason: collision with root package name */
            public TextView f2558u;

            public a(d dVar, View view) {
                super(view);
                this.f2558u = (TextView) view.findViewById(R.id.mr_picker_header_name);
            }
        }

        /* loaded from: classes.dex */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public final Object f2559a;

            /* renamed from: b  reason: collision with root package name */
            public final int f2560b;

            public b(d dVar, Object obj) {
                this.f2559a = obj;
                if (obj instanceof String) {
                    this.f2560b = 1;
                } else if (obj instanceof l.i) {
                    this.f2560b = 2;
                } else {
                    this.f2560b = 0;
                    Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                }
            }
        }

        /* loaded from: classes.dex */
        public class c extends RecyclerView.z {

            /* renamed from: u  reason: collision with root package name */
            public final View f2561u;

            /* renamed from: v  reason: collision with root package name */
            public final ImageView f2562v;

            /* renamed from: w  reason: collision with root package name */
            public final ProgressBar f2563w;

            /* renamed from: x  reason: collision with root package name */
            public final TextView f2564x;

            public c(View view) {
                super(view);
                this.f2561u = view;
                this.f2562v = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.f2563w = progressBar;
                this.f2564x = (TextView) view.findViewById(R.id.mr_picker_route_name);
                p.l(l.this.n, progressBar);
            }
        }

        public d() {
            this.f2552e = LayoutInflater.from(l.this.n);
            this.f2553f = p.e(l.this.n, R.attr.mediaRouteDefaultIconDrawable);
            this.f2554g = p.e(l.this.n, R.attr.mediaRouteTvIconDrawable);
            this.f2555h = p.e(l.this.n, R.attr.mediaRouteSpeakerIconDrawable);
            this.f2556i = p.e(l.this.n, R.attr.mediaRouteSpeakerGroupIconDrawable);
            m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int a() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int c(int i10) {
            return this.d.get(i10).f2560b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void h(RecyclerView.z zVar, int i10) {
            Drawable drawable;
            int i11 = this.d.get(i10).f2560b;
            b bVar = this.d.get(i10);
            if (i11 == 1) {
                a aVar = (a) zVar;
                Objects.requireNonNull(aVar);
                aVar.f2558u.setText(bVar.f2559a.toString());
            } else if (i11 != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                c cVar = (c) zVar;
                Objects.requireNonNull(cVar);
                l.i iVar = (l.i) bVar.f2559a;
                cVar.f2561u.setVisibility(0);
                cVar.f2563w.setVisibility(4);
                cVar.f2561u.setOnClickListener(new m(cVar, iVar));
                cVar.f2564x.setText(iVar.d);
                ImageView imageView = cVar.f2562v;
                d dVar = d.this;
                Objects.requireNonNull(dVar);
                Uri uri = iVar.f11334f;
                if (uri != null) {
                    try {
                        drawable = Drawable.createFromStream(l.this.n.getContentResolver().openInputStream(uri), null);
                    } catch (IOException e10) {
                        Log.w("RecyclerAdapter", "Failed to load " + uri, e10);
                    }
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    }
                }
                int i12 = iVar.f11341m;
                drawable = i12 != 1 ? i12 != 2 ? iVar.f() ? dVar.f2556i : dVar.f2553f : dVar.f2555h : dVar.f2554g;
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.z i(ViewGroup viewGroup, int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
                    return null;
                }
                return new c(this.f2552e.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            return new a(this, this.f2552e.inflate(R.layout.mr_picker_header_item, viewGroup, false));
        }

        public void m() {
            this.d.clear();
            this.d.add(new b(this, l.this.n.getString(R.string.mr_chooser_title)));
            for (l.i iVar : l.this.f2546u) {
                this.d.add(new b(this, iVar));
            }
            this.f2802a.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Comparator<l.i> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f2565c = new e();

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
    public l(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r3 = androidx.mediarouter.app.p.a(r3, r0, r0)
            int r0 = androidx.mediarouter.app.p.b(r3)
            r2.<init>(r3, r0)
            j1.k r3 = j1.k.f11274c
            r2.f2545t = r3
            androidx.mediarouter.app.l$a r3 = new androidx.mediarouter.app.l$a
            r3.<init>()
            r2.D = r3
            android.content.Context r3 = r2.getContext()
            j1.l r0 = j1.l.d(r3)
            r2.f2543j = r0
            androidx.mediarouter.app.l$c r0 = new androidx.mediarouter.app.l$c
            r0.<init>()
            r2.f2544m = r0
            r2.n = r3
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131427370(0x7f0b002a, float:1.8476354E38)
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.l.<init>(android.content.Context):void");
    }

    public void d() {
        if (this.A != null) {
            return;
        }
        if (this.f2548z) {
            ArrayList arrayList = new ArrayList(this.f2543j.f());
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                boolean z10 = true;
                if (size <= 0) {
                    break;
                }
                l.i iVar = (l.i) arrayList.get(i10);
                if (!((!iVar.e() && iVar.f11335g && iVar.i(this.f2545t)) ? false : false)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, e.f2565c);
            if (SystemClock.uptimeMillis() - this.C >= this.B) {
                this.C = SystemClock.uptimeMillis();
                this.f2546u.clear();
                this.f2546u.addAll(arrayList);
                this.f2547w.m();
                return;
            }
            this.D.removeMessages(1);
            Handler handler = this.D;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.C + this.B);
        }
    }

    public void e(j1.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!this.f2545t.equals(kVar)) {
            this.f2545t = kVar;
            if (this.f2548z) {
                this.f2543j.i(this.f2544m);
                this.f2543j.a(kVar, this.f2544m, 1);
            }
            d();
        }
    }

    public void f() {
        getWindow().setLayout(k.b(this.n), !this.n.getResources().getBoolean(R.bool.is_tablet) ? -1 : -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2548z = true;
        this.f2543j.a(this.f2545t, this.f2544m, 1);
        d();
    }

    @Override // e.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        p.k(this.n, this);
        this.f2546u = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new b());
        this.f2547w = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.y = recyclerView;
        recyclerView.setAdapter(this.f2547w);
        this.y.setLayoutManager(new LinearLayoutManager(this.n));
        f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2548z = false;
        this.f2543j.i(this.f2544m);
        this.D.removeMessages(1);
    }
}
