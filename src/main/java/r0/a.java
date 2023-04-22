package r0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import r0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: c  reason: collision with root package name */
    public boolean f14610c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14611f;

    /* renamed from: j  reason: collision with root package name */
    public Cursor f14612j;

    /* renamed from: m  reason: collision with root package name */
    public Context f14613m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public C0252a f14614t;

    /* renamed from: u  reason: collision with root package name */
    public DataSetObserver f14615u;

    /* renamed from: w  reason: collision with root package name */
    public r0.b f14616w;

    /* renamed from: r0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0252a extends ContentObserver {
        public C0252a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f14611f || (cursor = aVar.f14612j) == null || cursor.isClosed()) {
                return;
            }
            aVar.f14610c = aVar.f14612j.requery();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f14610c = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f14610c = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        int i10 = z10 ? 1 : 2;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f14611f = true;
        } else {
            this.f14611f = false;
        }
        boolean z11 = cursor != null;
        this.f14612j = cursor;
        this.f14610c = z11;
        this.f14613m = context;
        this.n = z11 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f14614t = new C0252a();
            this.f14615u = new b();
        } else {
            this.f14614t = null;
            this.f14615u = null;
        }
        if (z11) {
            C0252a c0252a = this.f14614t;
            if (c0252a != null) {
                cursor.registerContentObserver(c0252a);
            }
            DataSetObserver dataSetObserver = this.f14615u;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f14612j;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0252a c0252a = this.f14614t;
                if (c0252a != null) {
                    cursor2.unregisterContentObserver(c0252a);
                }
                DataSetObserver dataSetObserver = this.f14615u;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f14612j = cursor;
            if (cursor != null) {
                C0252a c0252a2 = this.f14614t;
                if (c0252a2 != null) {
                    cursor.registerContentObserver(c0252a2);
                }
                DataSetObserver dataSetObserver2 = this.f14615u;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.n = cursor.getColumnIndexOrThrow("_id");
                this.f14610c = true;
                notifyDataSetChanged();
            } else {
                this.n = -1;
                this.f14610c = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f14610c || (cursor = this.f14612j) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f14610c) {
            this.f14612j.moveToPosition(i10);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.A.inflate(cVar.f14620z, viewGroup, false);
            }
            a(view, this.f14613m, this.f14612j);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f14616w == null) {
            this.f14616w = new r0.b(this);
        }
        return this.f14616w;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f14610c || (cursor = this.f14612j) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f14612j;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f14610c && (cursor = this.f14612j) != null && cursor.moveToPosition(i10)) {
            return this.f14612j.getLong(this.n);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f14610c) {
            if (this.f14612j.moveToPosition(i10)) {
                if (view == null) {
                    view = d(this.f14613m, this.f14612j, viewGroup);
                }
                a(view, this.f14613m, this.f14612j);
                return view;
            }
            throw new IllegalStateException(a1.a.j("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
