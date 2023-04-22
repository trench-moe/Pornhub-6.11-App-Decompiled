package com.app.pornhub.view.home.playlists;

import android.view.View;
import com.app.pornhub.databinding.FragmentBasicListingsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class PlaylistsCommonFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, FragmentBasicListingsBinding> {

    /* renamed from: c  reason: collision with root package name */
    public static final PlaylistsCommonFragment$binding$2 f5252c = new PlaylistsCommonFragment$binding$2();

    public PlaylistsCommonFragment$binding$2() {
        super(1, FragmentBasicListingsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/app/pornhub/databinding/FragmentBasicListingsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public FragmentBasicListingsBinding invoke(View view) {
        View p02 = view;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return FragmentBasicListingsBinding.bind(p02);
    }
}
