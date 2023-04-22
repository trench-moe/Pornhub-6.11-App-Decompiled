package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class j0 extends r0.c implements View.OnClickListener {
    public static final /* synthetic */ int O = 0;
    public final SearchView B;
    public final SearchableInfo C;
    public final Context D;
    public final WeakHashMap<String, Drawable.ConstantState> E;
    public final int F;
    public int G;
    public ColorStateList H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1025a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1026b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1027c;
        public final ImageView d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1028e;

        public a(View view) {
            this.f1025a = (TextView) view.findViewById(16908308);
            this.f1026b = (TextView) view.findViewById(16908309);
            this.f1027c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.f1028e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public j0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.G = 1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.B = searchView;
        this.C = searchableInfo;
        this.F = searchView.getSuggestionCommitIconResId();
        this.D = context;
        this.E = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    @Override // r0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // r0.a
    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.I = cursor.getColumnIndex("suggest_text_1");
                this.J = cursor.getColumnIndex("suggest_text_2");
                this.K = cursor.getColumnIndex("suggest_text_2_url");
                this.L = cursor.getColumnIndex("suggest_icon_1");
                this.M = cursor.getColumnIndex("suggest_icon_2");
                this.N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // r0.a
    public CharSequence c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        if (!this.C.shouldRewriteQueryFromData() || (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
            if (!this.C.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                return null;
            }
            return h10;
        }
        return h11;
    }

    @Override // r0.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.A.inflate(this.y, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.F);
        return inflate;
    }

    public Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(android.support.v4.media.b.i("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.D.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments != null) {
                int size = pathSegments.size();
                if (size == 1) {
                    try {
                        parseInt = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new FileNotFoundException(android.support.v4.media.b.i("Single path segment is not a resource ID: ", uri));
                    }
                } else if (size != 2) {
                    throw new FileNotFoundException(android.support.v4.media.b.i("More than two path segments: ", uri));
                } else {
                    parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                }
                if (parseInt != 0) {
                    return resourcesForApplication.getDrawable(parseInt);
                }
                throw new FileNotFoundException(android.support.v4.media.b.i("No resource found for: ", uri));
            }
            throw new FileNotFoundException(android.support.v4.media.b.i("No path: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(android.support.v4.media.b.i("No package found for authority: ", uri));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final android.graphics.drawable.Drawable f(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.D.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // r0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.A.inflate(this.f14620z, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1025a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // r0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View d = d(this.D, this.f14612j, viewGroup);
            ((a) d.getTag()).f1025a.setText(e10.toString());
            return d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f14612j;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f14612j;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.B.s((CharSequence) tag);
        }
    }
}
