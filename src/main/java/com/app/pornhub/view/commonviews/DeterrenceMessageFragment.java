package com.app.pornhub.view.commonviews;

import a1.a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.navigation.f;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentDeterrenceMessageBinding;
import com.app.pornhub.utils.HtmlUtils;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.appsflyer.oaid.BuildConfig;
import d4.b;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import t3.o;
import v3.c;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/app/pornhub/view/commonviews/DeterrenceMessageFragment;", "Lv3/c;", "<init>", "()V", "Ld4/b;", "args", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DeterrenceMessageFragment extends c {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f4991s0 = {Reflection.property1(new PropertyReference1Impl(DeterrenceMessageFragment.class, "viewBinding", "getViewBinding()Lcom/app/pornhub/databinding/FragmentDeterrenceMessageBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f4992p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f4993q0;

    /* renamed from: r0  reason: collision with root package name */
    public final a f4994r0;

    /* loaded from: classes.dex */
    public static final class a implements HtmlUtils.a {
        public a() {
        }

        @Override // com.app.pornhub.utils.HtmlUtils.a
        public void a(String phone) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.putExtra("sms_body", BuildConfig.FLAVOR);
            intent.setData(Uri.parse(phone));
            try {
                DeterrenceMessageFragment.this.I0(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(DeterrenceMessageFragment.this.u0(), DeterrenceMessageFragment.this.I(R.string.no_sms_app_found), 0).show();
            }
        }

        @Override // com.app.pornhub.utils.HtmlUtils.a
        public void b(String phone) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            try {
                DeterrenceMessageFragment.this.I0(new Intent("android.intent.action.DIAL", Uri.parse(phone)));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(DeterrenceMessageFragment.this.u0(), DeterrenceMessageFragment.this.I(R.string.no_phone_app_found), 0).show();
            }
        }

        @Override // com.app.pornhub.utils.HtmlUtils.a
        public void c(String url, String title) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(title, "title");
            DeterrenceMessageFragment.this.I0(BrowserActivity.B(DeterrenceMessageFragment.this.s0(), url, title));
        }

        @Override // com.app.pornhub.utils.HtmlUtils.a
        public void d(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(Intrinsics.stringPlus("mailto:", email)));
            try {
                DeterrenceMessageFragment.this.I0(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(DeterrenceMessageFragment.this.u0(), DeterrenceMessageFragment.this.I(R.string.no_email_app_found), 0).show();
            }
        }
    }

    public DeterrenceMessageFragment() {
        super(R.layout.fragment_deterrence_message);
        this.f4992p0 = new LinkedHashMap();
        this.f4993q0 = m9.a.F(this, DeterrenceMessageFragment$viewBinding$2.f4996c, null, 2);
        this.f4994r0 = new a();
    }

    @Override // v3.c
    public void K0() {
        this.f4992p0.clear();
    }

    public final FragmentDeterrenceMessageBinding M0() {
        return (FragmentDeterrenceMessageBinding) this.f4993q0.getValue(this, f4991s0[0]);
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f4992p0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        f fVar = new f(Reflection.getOrCreateKotlinClass(b.class), new Function0<Bundle>() { // from class: com.app.pornhub.view.commonviews.DeterrenceMessageFragment$onViewCreated$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Bundle invoke() {
                Bundle bundle2 = Fragment.this.f2019u;
                if (bundle2 != null) {
                    return bundle2;
                }
                StringBuilder m10 = a.m("Fragment ");
                m10.append(Fragment.this);
                m10.append(" has null arguments");
                throw new IllegalStateException(m10.toString());
            }
        });
        o oVar = o.f15126a;
        TextView textView = M0().d;
        Intrinsics.checkNotNullExpressionValue(textView, "viewBinding.warningTitle");
        int i10 = ((b) fVar.getValue()).f8770a;
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setText(i10 == 109 ? textView.getContext().getString(R.string.warning_nl) : (i10 == 110 && Intrinsics.areEqual(Locale.getDefault().getLanguage(), new Locale("nl").getLanguage())) ? textView.getContext().getString(R.string.warning_nl) : textView.getContext().getString(R.string.warning));
        if (((b) fVar.getValue()).f8770a == 110 && Intrinsics.areEqual(Locale.getDefault().getLanguage(), new Locale("nl").getLanguage())) {
            ImageView imageView = M0().f4566b;
            Intrinsics.checkNotNullExpressionValue(imageView, "viewBinding.bannerImage");
            imageView.setVisibility(0);
            com.bumptech.glide.b.e(M0().f4566b).n(Integer.valueOf((int) R.drawable.deterrence_message_banner_belgium)).A(M0().f4566b);
        } else {
            ImageView imageView2 = M0().f4566b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "viewBinding.bannerImage");
            imageView2.setVisibility(8);
        }
        HtmlUtils htmlUtils = HtmlUtils.f4921a;
        TextView textView2 = M0().f4567c;
        Intrinsics.checkNotNullExpressionValue(textView2, "viewBinding.explanation");
        Context context = u0();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
        int i11 = ((b) fVar.getValue()).f8770a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i11 == 104) {
            string = context.getString(R.string.warning_explanation);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                contex…xplanation)\n            }");
        } else if (i11 == 105) {
            string = context.getString(R.string.warning_explanation_uk);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                contex…anation_uk)\n            }");
        } else if (i11 != 114) {
            switch (i11) {
                case 108:
                    string = context.getString(R.string.warning_explanation_nz);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n                contex…anation_nz)\n            }");
                    break;
                case 109:
                    string = Intrinsics.areEqual(Locale.getDefault().getLanguage(), new Locale("nl").getLanguage()) ? context.getString(R.string.warning_explanation_netherlands) : context.getString(R.string.warning_explanation);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n                if (Lo…          }\n            }");
                    break;
                case 110:
                    string = Intrinsics.areEqual(Locale.getDefault().getLanguage(), new Locale("nl").getLanguage()) ? context.getString(R.string.warning_explanation_belgium_dutch) : context.getString(R.string.warning_explanation_belgium_english);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n                if (Lo…          }\n            }");
                    break;
                default:
                    string = context.getString(R.string.warning_explanation);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n                contex…xplanation)\n            }");
                    break;
            }
        } else {
            string = context.getString(R.string.warning_explanation_us);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                contex…anation_us)\n            }");
        }
        htmlUtils.b(textView2, string, this.f4994r0);
    }
}
