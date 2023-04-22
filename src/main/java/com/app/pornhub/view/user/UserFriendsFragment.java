package com.app.pornhub.view.user;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.user.a;
import com.appsflyer.oaid.BuildConfig;
import f3.i;
import f3.o;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.g;
import x2.i1;
import x2.y;
import z2.cp;

/* loaded from: classes.dex */
public class UserFriendsFragment extends Fragment implements cp, a.b {
    public static final /* synthetic */ int O0 = 0;
    public TextView A0;
    public ImageView B0;
    public LinearLayout C0;
    public LinearLayout D0;
    public TextView E0;
    public Button F0;
    public ArrayList<TextView> G0;
    public TextView H0;
    public TextView I0;
    public TextView J0;
    public Disposable K0;
    public boolean L0;
    public AbsListView.OnScrollListener M0 = new a();
    public View.OnClickListener N0 = new u3.b(this, 12);

    /* renamed from: n0  reason: collision with root package name */
    public n3.a f5494n0;

    /* renamed from: o0  reason: collision with root package name */
    public n3.b f5495o0;

    /* renamed from: p0  reason: collision with root package name */
    public n3.a f5496p0;

    /* renamed from: q0  reason: collision with root package name */
    public i f5497q0;

    /* renamed from: r0  reason: collision with root package name */
    public o f5498r0;

    /* renamed from: s0  reason: collision with root package name */
    public String f5499s0;

    /* renamed from: t0  reason: collision with root package name */
    public UserQueryType f5500t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5501u0;

    /* renamed from: v0  reason: collision with root package name */
    public com.app.pornhub.view.user.a f5502v0;
    public ListView w0;

    /* renamed from: x0  reason: collision with root package name */
    public LinearLayout f5503x0;

    /* renamed from: y0  reason: collision with root package name */
    public LinearLayout f5504y0;

    /* renamed from: z0  reason: collision with root package name */
    public LinearLayout f5505z0;

    /* loaded from: classes.dex */
    public enum UserQueryType {
        FRIENDS,
        SUBSCRIBERS,
        SUBSCRIPTIONS
    }

    /* loaded from: classes.dex */
    public class a implements AbsListView.OnScrollListener {
        public a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            int i13 = i10 + i11;
            UserFriendsFragment userFriendsFragment = UserFriendsFragment.this;
            if (userFriendsFragment.L0 || !userFriendsFragment.f5501u0 || i13 < userFriendsFragment.f5502v0.getCount()) {
                return;
            }
            UserFriendsFragment.this.M0();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public int f5511c;

        public b(int i10, a aVar) {
            this.f5511c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UserFriendsFragment userFriendsFragment = UserFriendsFragment.this;
            int i10 = this.f5511c;
            int i11 = UserFriendsFragment.O0;
            userFriendsFragment.N0(i10);
            t3.a.y("tab_FRIENDS_" + UserFriendsFragment.this.G0.get(this.f5511c).getTag().toString().toLowerCase(Locale.US));
        }
    }

    public final TextView K0(TextView textView, UserQueryType userQueryType, int i10) {
        textView.setOnClickListener(new b(i10, null));
        textView.setTag(userQueryType);
        return textView;
    }

    public final void L0(String str, boolean z10) {
        this.w0.setVisibility(8);
        this.f5503x0.setVisibility(0);
        this.f5504y0.setVisibility(8);
        this.B0.setImageResource(t3.o.g(UsersConfig.isGay(this.f5498r0.a().getOrientation())));
        this.f5505z0.setVisibility(0);
        this.f5505z0.setOnClickListener(z10 ? this.N0 : null);
        this.A0.setText(str);
    }

    public final void M0() {
        Disposable disposable = this.K0;
        if (disposable == null || disposable.isDisposed()) {
            Observable observable = null;
            if (this.f5500t0 == UserQueryType.FRIENDS) {
                observable = this.f5496p0.a(this.f5499s0, this.f5502v0.a());
            } else if (!this.f5497q0.a().isEmpty()) {
                UserQueryType userQueryType = this.f5500t0;
                if (userQueryType == UserQueryType.SUBSCRIBERS) {
                    observable = this.f5494n0.a(this.f5499s0, this.f5502v0.a());
                } else if (userQueryType == UserQueryType.SUBSCRIPTIONS) {
                    n3.b bVar = this.f5495o0;
                    String targetUserId = this.f5499s0;
                    int a10 = this.f5502v0.a();
                    Objects.requireNonNull(bVar);
                    Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
                    observable = bVar.f13283a.b(targetUserId, 16, a10).toObservable().map(y.I).onErrorReturn(i1.E).startWith((Observable) UseCaseResult.a.f4910a);
                    Intrinsics.checkNotNullExpressionValue(observable, "userRepository.getSubscr…th(UseCaseResult.Loading)");
                }
            } else {
                L0(I(R.string.error_user_login_community_required), true);
            }
            if (observable == null) {
                return;
            }
            this.K0 = observable.subscribe(new g(this, 17));
        }
    }

    public final void N0(int i10) {
        this.f5500t0 = (UserQueryType) this.G0.get(i10).getTag();
        com.app.pornhub.view.user.a aVar = this.f5502v0;
        aVar.f5522f.clear();
        aVar.f5523j.clear();
        aVar.f5524m.clear();
        aVar.n = BuildConfig.FLAVOR;
        aVar.notifyDataSetChanged();
        this.f5501u0 = true;
        M0();
        int ordinal = this.f5500t0.ordinal();
        if (ordinal == 1) {
            t3.a.x(q(), "Home", "UserSubscribers");
        } else if (ordinal != 2) {
            t3.a.x(q(), "Home", "UserFriends");
        } else {
            t3.a.x(q(), "Home", "UserSubscriptions");
        }
        int i11 = 0;
        while (i11 < this.G0.size()) {
            this.G0.get(i11).setSelected(i10 == i11);
            i11++;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void S(Context context) {
        super.S(context);
        this.f5502v0 = new com.app.pornhub.view.user.a(this);
        this.f5501u0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_friendlist, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(R.id.fragment_friendlist_lvFriends);
        this.w0 = listView;
        listView.setAdapter((ListAdapter) this.f5502v0);
        this.w0.addFooterView(layoutInflater.inflate(R.layout.include_list_footer, (ViewGroup) null), null, false);
        this.f5503x0 = (LinearLayout) inflate.findViewById(R.id.fragment_friendlist_includeStatus);
        this.f5504y0 = (LinearLayout) inflate.findViewById(R.id.status_llyLoading);
        this.A0 = (TextView) inflate.findViewById(R.id.error_txtError);
        this.f5505z0 = (LinearLayout) inflate.findViewById(R.id.errorLayout);
        this.B0 = (ImageView) inflate.findViewById(R.id.error_segment_image);
        this.f5505z0.setOnClickListener(this.N0);
        this.C0 = (LinearLayout) inflate.findViewById(R.id.include_list_footer_llyLoading);
        this.D0 = (LinearLayout) inflate.findViewById(R.id.include_list_footer_llyError);
        this.E0 = (TextView) inflate.findViewById(R.id.include_list_footer_txtError);
        Button button = (Button) inflate.findViewById(R.id.include_list_footer_btnRetry);
        this.F0 = button;
        button.setOnClickListener(this.N0);
        this.H0 = (TextView) inflate.findViewById(R.id.fragment_user_friendlist_tab_txtFriends);
        this.I0 = (TextView) inflate.findViewById(R.id.fragment_user_friendlist_tab_txtSubscribers);
        this.J0 = (TextView) inflate.findViewById(R.id.fragment_user_friendlist_tab_txtSubscriptions);
        ArrayList<TextView> arrayList = new ArrayList<>();
        this.G0 = arrayList;
        TextView textView = this.H0;
        K0(textView, UserQueryType.FRIENDS, arrayList.size());
        arrayList.add(textView);
        ArrayList<TextView> arrayList2 = this.G0;
        TextView textView2 = this.I0;
        K0(textView2, UserQueryType.SUBSCRIBERS, arrayList2.size());
        arrayList2.add(textView2);
        ArrayList<TextView> arrayList3 = this.G0;
        TextView textView3 = this.J0;
        K0(textView3, UserQueryType.SUBSCRIPTIONS, arrayList3.size());
        arrayList3.add(textView3);
        Bundle bundle2 = this.f2019u;
        if (bundle2 != null) {
            i10 = bundle2.getInt("tab", 0);
            this.f5499s0 = t3.o.j(bundle2, "targetUserId");
        }
        N0(i10);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        Disposable disposable = this.K0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void g0() {
        this.U = true;
        this.f5502v0.notifyDataSetChanged();
    }
}
