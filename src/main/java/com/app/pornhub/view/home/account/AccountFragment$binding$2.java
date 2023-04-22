package com.app.pornhub.view.home.account;

import android.view.View;
import com.app.pornhub.databinding.FragmentAccountBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class AccountFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, FragmentAccountBinding> {

    /* renamed from: c  reason: collision with root package name */
    public static final AccountFragment$binding$2 f5051c = new AccountFragment$binding$2();

    public AccountFragment$binding$2() {
        super(1, FragmentAccountBinding.class, "bind", "bind(Landroid/view/View;)Lcom/app/pornhub/databinding/FragmentAccountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public FragmentAccountBinding invoke(View view) {
        View p02 = view;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return FragmentAccountBinding.bind(p02);
    }
}
