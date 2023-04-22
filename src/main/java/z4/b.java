package z4;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentPerformerInfoBinding;
import com.app.pornhub.domain.model.category.Category;
import com.appsflyer.oaid.BuildConfig;
import d3.c;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import z2.cp;

/* loaded from: classes2.dex */
public class b extends Fragment implements cp {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f21776v0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public z.b f21777n0;

    /* renamed from: o0  reason: collision with root package name */
    public c f21778o0;

    /* renamed from: p0  reason: collision with root package name */
    public sc.c f21779p0;

    /* renamed from: q0  reason: collision with root package name */
    public CompositeDisposable f21780q0;

    /* renamed from: r0  reason: collision with root package name */
    public FragmentPerformerInfoBinding f21781r0;

    /* renamed from: s0  reason: collision with root package name */
    public Set<String> f21782s0;

    /* renamed from: t0  reason: collision with root package name */
    public Set<String> f21783t0;

    /* renamed from: u0  reason: collision with root package name */
    public List<Category> f21784u0;

    public final void K0(TextView textView, String str, String str2) {
        String str3;
        String replace;
        String str4;
        String str5;
        b bVar = this;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-1), 0, spannableString.length(), 0);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString).append(" ");
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str6 = BuildConfig.FLAVOR;
        Spanned fromHtml = Html.fromHtml(isEmpty ? BuildConfig.FLAVOR : str2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder2.getSpans(0, fromHtml.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i10 = 0;
        while (i10 < length) {
            URLSpan uRLSpan = uRLSpanArr[i10];
            int spanStart = spannableStringBuilder2.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder2.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder2.getSpanFlags(uRLSpan);
            String lowerCase = uRLSpan.getURL().toLowerCase();
            if (lowerCase.contains("video?c=")) {
                str3 = lowerCase.substring(lowerCase.indexOf("c="), lowerCase.length()).replace("c=", str6);
                bVar.f21782s0.add(str3);
            } else {
                if (lowerCase.contains("categories/")) {
                    String replace2 = lowerCase.substring(lowerCase.indexOf("categories/"), lowerCase.length()).replace("categories/", str6);
                    bVar.f21783t0.add(replace2);
                    str5 = replace2;
                    str4 = str6;
                    replace = str4;
                } else if (lowerCase.contains("pornstar/")) {
                    replace = lowerCase.substring(lowerCase.indexOf("pornstar/"), lowerCase.length()).replace("pornstar/", str6);
                    str4 = str6;
                    str5 = str4;
                } else {
                    str3 = str6;
                }
                spannableStringBuilder2.setSpan(new a(this, lowerCase, str4, str5, replace), spanStart, spanEnd, spanFlags);
                spannableStringBuilder2.removeSpan(uRLSpan);
                i10++;
                bVar = this;
                str6 = str6;
                uRLSpanArr = uRLSpanArr;
            }
            str4 = str3;
            str5 = str6;
            replace = str5;
            spannableStringBuilder2.setSpan(new a(this, lowerCase, str4, str5, replace), spanStart, spanEnd, spanFlags);
            spannableStringBuilder2.removeSpan(uRLSpan);
            i10++;
            bVar = this;
            str6 = str6;
            uRLSpanArr = uRLSpanArr;
        }
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.fragment.app.Fragment
    public void S(Context context) {
        super.S(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.f21782s0 = new HashSet();
        this.f21783t0 = new HashSet();
        this.f21784u0 = new ArrayList();
        this.f21780q0 = new CompositeDisposable();
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21781r0 = FragmentPerformerInfoBinding.bind(layoutInflater.inflate(R.layout.fragment_performer_info, viewGroup, false));
        ((com.app.pornhub.view.performerdetails.a) new z(s0(), this.f21777n0).a(com.app.pornhub.view.performerdetails.a.class)).f5412f.f(K(), new g4.c(this, 7));
        return this.f21781r0.f4625a;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        this.f21780q0.clear();
        this.f21781r0 = null;
    }
}
