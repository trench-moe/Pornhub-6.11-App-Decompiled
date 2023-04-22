package q4;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemSearchSuggestionBinding;
import com.app.pornhub.databinding.ItemSearchSuggestionExtendedBinding;
import com.app.pornhub.databinding.ItemSearchSuggestionHeaderBinding;
import com.app.pornhub.databinding.ItemSearchSuggestionLineDividerBinding;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.search.ChannelSuggestion;
import com.app.pornhub.domain.model.search.PornstarSuggestion;
import com.app.pornhub.domain.model.search.SearchSuggestions;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class d extends t<e, c> {

    /* renamed from: f  reason: collision with root package name */
    public final int f14342f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14343g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14344h;

    /* renamed from: i  reason: collision with root package name */
    public final int f14345i;

    /* renamed from: j  reason: collision with root package name */
    public final int f14346j;

    /* renamed from: k  reason: collision with root package name */
    public final List<e> f14347k;

    /* renamed from: l  reason: collision with root package name */
    public String f14348l;

    /* renamed from: m  reason: collision with root package name */
    public a f14349m;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void b(String str);

        void c(String str);
    }

    /* loaded from: classes2.dex */
    public final class b extends c {

        /* renamed from: u  reason: collision with root package name */
        public final ItemSearchSuggestionExtendedBinding f14350u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ d f14351v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d this$0, ItemSearchSuggestionExtendedBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f14351v = this$0;
            this.f14350u = binding;
        }

        @Override // q4.d.c
        public void x(e item) {
            Intrinsics.checkNotNullParameter(item, "item");
            d dVar = this.f14351v;
            TextView textView = this.f14350u.f4790b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            d.n(dVar, item, textView);
            this.f14350u.f4791c.setText(item.d);
            this.f14350u.f4789a.setOnClickListener(new q4.e(this.f14351v, item, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c extends RecyclerView.z {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
        }

        public abstract void x(e eVar);
    }

    /* renamed from: q4.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0248d extends c {

        /* renamed from: u  reason: collision with root package name */
        public final ItemSearchSuggestionHeaderBinding f14352u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ d f14353v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0248d(d this$0, ItemSearchSuggestionHeaderBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f14353v = this$0;
            this.f14352u = binding;
        }

        @Override // q4.d.c
        public void x(e item) {
            Intrinsics.checkNotNullParameter(item, "item");
            d dVar = this.f14353v;
            TextView textView = this.f14352u.f4793b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            d.n(dVar, item, textView);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f14354a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14355b;

        /* renamed from: c  reason: collision with root package name */
        public final String f14356c;
        public final String d;

        public e(int i10, String str, String str2, String str3) {
            a0.a.u(str, "text", str2, "searchKeyword", str3, "rank");
            this.f14354a = i10;
            this.f14355b = str;
            this.f14356c = str2;
            this.d = str3;
        }

        public /* synthetic */ e(int i10, String str, String str2, String str3, int i11) {
            this(i10, str, str2, (i11 & 8) != 0 ? BuildConfig.FLAVOR : null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f14354a == eVar.f14354a && Intrinsics.areEqual(this.f14355b, eVar.f14355b) && Intrinsics.areEqual(this.f14356c, eVar.f14356c) && Intrinsics.areEqual(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            return this.d.hashCode() + a1.a.b(this.f14356c, a1.a.b(this.f14355b, this.f14354a * 31, 31), 31);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Item(type=");
            m10.append(this.f14354a);
            m10.append(", text=");
            m10.append(this.f14355b);
            m10.append(", searchKeyword=");
            m10.append(this.f14356c);
            m10.append(", rank=");
            return android.support.v4.media.b.l(m10, this.d, ')');
        }
    }

    /* loaded from: classes2.dex */
    public final class f extends c {

        /* renamed from: u  reason: collision with root package name */
        public final ItemSearchSuggestionBinding f14357u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ d f14358v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d this$0, ItemSearchSuggestionBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f14358v = this$0;
            this.f14357u = binding;
        }

        @Override // q4.d.c
        public void x(e item) {
            Intrinsics.checkNotNullParameter(item, "item");
            d dVar = this.f14358v;
            TextView textView = this.f14357u.f4788b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            d.n(dVar, item, textView);
            this.f14357u.f4787a.setOnClickListener(new q4.f(this.f14358v, item, 0));
        }
    }

    /* loaded from: classes2.dex */
    public final class g extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(d this$0, ItemSearchSuggestionLineDividerBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
        }

        @Override // q4.d.c
        public void x(e item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    /* loaded from: classes2.dex */
    public final class h extends c {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ int f14359w = 0;

        /* renamed from: u  reason: collision with root package name */
        public final ItemSearchSuggestionExtendedBinding f14360u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ d f14361v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d this$0, ItemSearchSuggestionExtendedBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f14361v = this$0;
            this.f14360u = binding;
        }

        @Override // q4.d.c
        public void x(e item) {
            Intrinsics.checkNotNullParameter(item, "item");
            d dVar = this.f14361v;
            TextView textView = this.f14360u.f4790b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            d.n(dVar, item, textView);
            this.f14360u.f4791c.setText(item.d);
            this.f14360u.f4789a.setOnClickListener(new i4.d(this.f14361v, item, 2));
        }
    }

    public d() {
        this(null, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.n.e r2, int r3) {
        /*
            r1 = this;
            r2 = 1
            r3 = r3 & r2
            if (r3 == 0) goto La
            q4.c r3 = new q4.c
            r3.<init>()
            goto Lb
        La:
            r3 = 0
        Lb:
            java.lang.String r0 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r3)
            r1.f14342f = r2
            r2 = 2
            r1.f14343g = r2
            r2 = 3
            r1.f14344h = r2
            r2 = 4
            r1.f14345i = r2
            r1.f14346j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f14347k = r2
            java.lang.String r2 = ""
            r1.f14348l = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.d.<init>(androidx.recyclerview.widget.n$e, int):void");
    }

    public static final void n(d dVar, e eVar, TextView textView) {
        Objects.requireNonNull(dVar);
        String str = eVar.f14355b;
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String str2 = dVar.f14348l;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase2 = str2.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) lowerCase, lowerCase2, 0, false, 6, (Object) null);
        if (!(dVar.f14348l.length() > 0) || indexOf$default < 0) {
            textView.setText(eVar.f14355b);
            return;
        }
        int b10 = c0.a.b(textView.getContext(), R.color.white);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(eVar.f14355b);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(b10);
        StyleSpan styleSpan = new StyleSpan(1);
        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf$default, dVar.f14348l.length() + indexOf$default, 18);
        spannableStringBuilder.setSpan(styleSpan, indexOf$default, dVar.f14348l.length() + indexOf$default, 18);
        textView.setText(spannableStringBuilder);
    }

    @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.f14347k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        return this.f14347k.get(i10).f14354a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        c holder = (c) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.x(this.f14347k.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 == 0) {
            ItemSearchSuggestionBinding bind = ItemSearchSuggestionBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_suggestion, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …lse\n                    )");
            return new f(this, bind);
        } else if (i10 == this.f14342f) {
            ItemSearchSuggestionHeaderBinding bind2 = ItemSearchSuggestionHeaderBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_suggestion_header, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind2, "inflate(\n               …lse\n                    )");
            return new C0248d(this, bind2);
        } else if (i10 == this.f14343g) {
            ItemSearchSuggestionExtendedBinding a10 = ItemSearchSuggestionExtendedBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …lse\n                    )");
            return new h(this, a10);
        } else if (i10 == this.f14344h) {
            ItemSearchSuggestionExtendedBinding a11 = ItemSearchSuggestionExtendedBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a11, "inflate(\n               …lse\n                    )");
            return new b(this, a11);
        } else if (i10 == this.f14345i) {
            ItemSearchSuggestionLineDividerBinding bind3 = ItemSearchSuggestionLineDividerBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_suggestion_line_divider, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind3, "inflate(\n               …lse\n                    )");
            return new g(this, bind3);
        } else {
            throw new IllegalStateException("Unknown item type");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void o(Context context, String search, SearchSuggestions suggestions) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f14347k.clear();
        String source = suggestions.getSource();
        switch (source.hashCode()) {
            case -989034367:
                if (source.equals(SearchSuggestionsConfig.sourcePhotos)) {
                    str = context.getString(R.string.photos);
                    break;
                }
                str = BuildConfig.FLAVOR;
                break;
            case -816678056:
                if (source.equals(SearchSuggestionsConfig.sourceVideos)) {
                    str = context.getString(R.string.videos);
                    break;
                }
                str = BuildConfig.FLAVOR;
                break;
            case 3172655:
                if (source.equals(SearchSuggestionsConfig.sourceGifs)) {
                    str = context.getString(R.string.gifs);
                    break;
                }
                str = BuildConfig.FLAVOR;
                break;
            case 962150598:
                if (source.equals(SearchSuggestionsConfig.sourcePornstars)) {
                    str = context.getString(R.string.video_results);
                    break;
                }
                str = BuildConfig.FLAVOR;
                break;
            default:
                str = BuildConfig.FLAVOR;
                break;
        }
        String str2 = str;
        Intrinsics.checkNotNullExpressionValue(str2, "when (suggestions.source…     else -> \"\"\n        }");
        ArrayList arrayList = new ArrayList();
        if (!suggestions.getPornstarSuggestions().isEmpty()) {
            int i10 = this.f14342f;
            String string = context.getString(R.string.pornstar_profiles);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.pornstar_profiles)");
            arrayList.add(new e(i10, string, BuildConfig.FLAVOR, null, 8));
            for (PornstarSuggestion pornstarSuggestion : CollectionsKt.take(suggestions.getPornstarSuggestions(), this.f14346j)) {
                arrayList.add(new e(this.f14343g, pornstarSuggestion.getName(), pornstarSuggestion.getSlug(), pornstarSuggestion.getRank()));
            }
            arrayList.add(new e(this.f14345i, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, 8));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new e(this.f14342f, str2, BuildConfig.FLAVOR, null, 8));
        for (String str3 : CollectionsKt.take(suggestions.getSuggestions(), this.f14346j)) {
            arrayList2.add(new e(0, str3, str3, null, 8));
        }
        arrayList2.add(new e(this.f14345i, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, 8));
        ArrayList arrayList3 = new ArrayList();
        if (!suggestions.getChannelSuggestions().isEmpty()) {
            int i11 = this.f14342f;
            String string2 = context.getString(R.string.channels);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.channels)");
            arrayList3.add(new e(i11, string2, BuildConfig.FLAVOR, null, 8));
            for (ChannelSuggestion channelSuggestion : CollectionsKt.take(suggestions.getChannelSuggestions(), this.f14346j)) {
                arrayList3.add(new e(this.f14344h, channelSuggestion.getName(), String.valueOf(channelSuggestion.getId()), channelSuggestion.getRank()));
            }
            arrayList3.add(new e(this.f14345i, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, 8));
        }
        if (Intrinsics.areEqual(suggestions.getSource(), SearchSuggestionsConfig.sourcePornstars)) {
            this.f14347k.addAll(arrayList);
            this.f14347k.addAll(arrayList2);
            this.f14347k.addAll(arrayList3);
        } else {
            this.f14347k.addAll(arrayList2);
            this.f14347k.addAll(arrayList);
            this.f14347k.addAll(arrayList3);
        }
        this.f14348l = search;
        this.f2802a.b();
    }
}
