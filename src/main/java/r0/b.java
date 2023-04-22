package r0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.j0;

/* loaded from: classes2.dex */
public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f14619a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.f14619a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((j0) this.f14619a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r9) {
        /*
            r8 = this;
            r4 = r8
            r0.b$a r0 = r4.f14619a
            androidx.appcompat.widget.j0 r0 = (androidx.appcompat.widget.j0) r0
            r7 = 3
            java.util.Objects.requireNonNull(r0)
            if (r9 != 0) goto Lf
            java.lang.String r6 = ""
            r9 = r6
            goto L14
        Lf:
            java.lang.String r6 = r9.toString()
            r9 = r6
        L14:
            androidx.appcompat.widget.SearchView r1 = r0.B
            int r1 = r1.getVisibility()
            r7 = 0
            r2 = r7
            if (r1 != 0) goto L43
            androidx.appcompat.widget.SearchView r1 = r0.B
            r6 = 6
            int r7 = r1.getWindowVisibility()
            r1 = r7
            if (r1 == 0) goto L2a
            r7 = 6
            goto L43
        L2a:
            android.app.SearchableInfo r1 = r0.C     // Catch: java.lang.RuntimeException -> L39
            r6 = 50
            r3 = r6
            android.database.Cursor r9 = r0.g(r1, r9, r3)     // Catch: java.lang.RuntimeException -> L39
            if (r9 == 0) goto L43
            r9.getCount()     // Catch: java.lang.RuntimeException -> L39
            goto L44
        L39:
            r9 = move-exception
            java.lang.String r7 = "SuggestionsAdapter"
            r0 = r7
            java.lang.String r1 = "Search suggestions query threw an exception."
            r6 = 2
            android.util.Log.w(r0, r1, r9)
        L43:
            r9 = r2
        L44:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            r7 = 5
            if (r9 == 0) goto L57
            int r1 = r9.getCount()
            r0.count = r1
            r6 = 4
            r0.values = r9
            r6 = 2
            goto L5e
        L57:
            r9 = 0
            r0.count = r9
            r7 = 1
            r0.values = r2
            r6 = 5
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f14619a;
        Cursor cursor = ((r0.a) aVar).f14612j;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((j0) aVar).b((Cursor) obj);
    }
}
