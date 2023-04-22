package com.app.pornhub.view.user;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.NavHomeDirections;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.user.ProfileFragment;
import com.app.pornhub.view.user.b;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import f3.h;
import f3.i;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import java.text.SimpleDateFormat;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import q3.d;
import t3.o;
import x2.i1;
import x2.k0;
import x2.l0;
import x2.y;

/* loaded from: classes.dex */
public class ProfileFragment extends v3.c implements b.InterfaceC0063b {
    public static final /* synthetic */ int U0 = 0;
    public LinearLayoutManager A0;
    public ImageView B0;
    public TextView C0;
    public TextView D0;
    public TextView E0;
    public View F0;
    public ImageView G0;
    public ImageView H0;
    public TextView I0;
    public TextView J0;
    public TextView K0;
    public TextView L0;
    public TextView M0;
    public TextView N0;
    public TextView O0;
    public TextView P0;
    public boolean Q0;
    public boolean R0;
    public String S0;
    public CompositeDisposable T0;

    /* renamed from: p0  reason: collision with root package name */
    public e3.c f5482p0;

    /* renamed from: q0  reason: collision with root package name */
    public h f5483q0;

    /* renamed from: r0  reason: collision with root package name */
    public i f5484r0;

    /* renamed from: s0  reason: collision with root package name */
    public n3.b f5485s0;

    /* renamed from: t0  reason: collision with root package name */
    public d f5486t0;

    /* renamed from: u0  reason: collision with root package name */
    public NavigationViewModel f5487u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f5488v0;
    public String w0;

    /* renamed from: x0  reason: collision with root package name */
    public User f5489x0;

    /* renamed from: y0  reason: collision with root package name */
    public RecyclerView f5490y0;

    /* renamed from: z0  reason: collision with root package name */
    public com.app.pornhub.view.user.b f5491z0;

    /* loaded from: classes.dex */
    public class b extends RecyclerView.p {
        public b(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            ProfileFragment profileFragment = ProfileFragment.this;
            if (!profileFragment.R0 && profileFragment.Q0 && profileFragment.A0.Y0() == ProfileFragment.this.f5491z0.a() - 1) {
                ProfileFragment.this.M0();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.k {

        /* renamed from: a  reason: collision with root package name */
        public int f5493a;

        public c(Context context) {
            this.f5493a = context.getResources().getDimensionPixelSize(R.dimen.list_item_spacing);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
            int i10 = this.f5493a;
            rect.left = i10;
            rect.right = i10;
            rect.bottom = i10;
            rect.top = i10;
        }
    }

    public ProfileFragment() {
        super(R.layout.fragment_profile);
    }

    public final void M0() {
        if (!UsersConfig.isUserLoggedIn(this.f5483q0.a())) {
            O0(I(R.string.error_user_login_community_required));
            return;
        }
        O0(BuildConfig.FLAVOR);
        e3.c cVar = this.f5482p0;
        String targetUserId = this.f5488v0;
        int a10 = this.f5491z0.a();
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Observable startWith = cVar.f9037a.a(targetUserId, 16, a10).toObservable().map(k0.n).onErrorReturn(l0.f17788w).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "commentsRepository.getPr…th(UseCaseResult.Loading)");
        this.T0.add(startWith.subscribe(new x2.b(this, 14)));
    }

    public final void N0(String str) {
        Fragment userFriendsFragment;
        NavigationViewModel navigationViewModel = this.f5487u0;
        char c10 = 65535;
        if (navigationViewModel != null) {
            switch (str.hashCode()) {
                case -2082779238:
                    if (str.equals("UserFriendsFragment")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -213568836:
                    if (str.equals("UserPhotosFragment")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1687724367:
                    if (str.equals("UserVideoListingsFragment")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    UserMetaData userMetaData = navigationViewModel.f5037i;
                    if (userMetaData == null) {
                        return;
                    }
                    navigationViewModel.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.f4266a.h(userMetaData.getId())));
                    return;
                case 1:
                    UserMetaData userMetaData2 = navigationViewModel.f5037i;
                    if (userMetaData2 == null) {
                        return;
                    }
                    navigationViewModel.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.f4266a.i(userMetaData2.getId())));
                    return;
                case 2:
                    navigationViewModel.w();
                    return;
                default:
                    throw new IllegalStateException("Couldn't navigate anywhere. Please check how you use this fragment.");
            }
        } else if (!(s0() instanceof ProfileActivity)) {
            throw new IllegalStateException("Couldn't navigate anywhere. Please check how you use this fragment.");
        } else {
            ProfileActivity profileActivity = (ProfileActivity) s0();
            String str2 = this.f5488v0;
            Bundle bundle = new Bundle();
            int hashCode = str.hashCode();
            if (hashCode != -2082779238) {
                if (hashCode != -213568836) {
                    if (hashCode == 1687724367 && str.equals("UserVideoListingsFragment")) {
                        c10 = 2;
                    }
                } else if (str.equals("UserPhotosFragment")) {
                    c10 = 1;
                }
            } else if (str.equals("UserFriendsFragment")) {
                c10 = 0;
            }
            if (c10 == 0) {
                bundle.putString("targetUserId", str2);
                userFriendsFragment = new UserFriendsFragment();
                userFriendsFragment.A0(bundle);
            } else if (c10 == 1) {
                bundle.putString("targetUserId", str2);
                userFriendsFragment = new UserPhotosFragment();
                userFriendsFragment.A0(bundle);
            } else if (c10 != 2) {
                return;
            } else {
                bundle.putString("targetUserId", str2);
                userFriendsFragment = new UserVideoListingsFragment();
                userFriendsFragment.A0(bundle);
            }
            kf.a.f12078a.e("replaceFragment - showing: %s", userFriendsFragment.getClass().getSimpleName());
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(profileActivity.u());
            aVar.i(R.id.container_main, userFriendsFragment, userFriendsFragment.getClass().getSimpleName());
            aVar.c(userFriendsFragment.getClass().getSimpleName());
            aVar.d();
        }
    }

    public final void O0(String str) {
        if (TextUtils.isEmpty(str)) {
            this.P0.setVisibility(8);
            this.f5490y0.setVisibility(0);
            return;
        }
        this.P0.setVisibility(0);
        this.P0.setText(str);
        this.f5490y0.setVisibility(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void P0() {
        String string;
        String string2;
        Context context = q();
        if (context != null) {
            com.bumptech.glide.b.c(q()).g(this).o(this.f5489x0.getUserMetaData().getUrlThumbnail()).A(this.B0);
            this.N0.setText(context.getResources().getQuantityString(R.plurals.n_times, this.f5489x0.getMyProfileViewedCount(), Integer.valueOf(this.f5489x0.getMyProfileViewedCount())));
        }
        this.C0.setText(SimpleDateFormat.getDateInstance(1).format(Long.valueOf(this.f5489x0.getDateAddedMilliseconds())));
        this.D0.setText(SimpleDateFormat.getDateInstance(1).format(Long.valueOf(this.f5489x0.getLastLoginMilliseconds())));
        this.E0.setText(String.valueOf(this.f5489x0.getVideoWatchedCount()));
        this.I0.setText(this.f5489x0.getFullName());
        this.J0.setText(String.valueOf(this.f5489x0.getAge()));
        TextView textView = this.K0;
        int gender = this.f5489x0.getGender();
        o oVar = o.f15126a;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "-";
        switch (gender) {
            case 1:
                string = context.getString(R.string.gender_male);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…mon.R.string.gender_male)");
                break;
            case 2:
                string = context.getString(R.string.gender_female);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…n.R.string.gender_female)");
                break;
            case 3:
                string = context.getString(R.string.gender_couple);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…n.R.string.gender_couple)");
                break;
            case 4:
            case 8:
                string = str;
                break;
            case 5:
                string = context.getString(R.string.gender_m2f);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…mmon.R.string.gender_m2f)");
                break;
            case 6:
                string = context.getString(R.string.gender_female_couple);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…ing.gender_female_couple)");
                break;
            case 7:
                string = context.getString(R.string.gender_male_couple);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…tring.gender_male_couple)");
                break;
            case 9:
                string = context.getString(R.string.gender_f2m);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…mmon.R.string.gender_f2m)");
                break;
            case 10:
                string = context.getString(R.string.gender_other);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.ap…on.R.string.gender_other)");
                break;
            default:
                string = str;
                break;
        }
        textView.setText(string);
        TextView textView2 = this.L0;
        int relationStatus = this.f5489x0.getRelationStatus();
        Intrinsics.checkNotNullParameter(context, "context");
        if (relationStatus == 1) {
            string2 = context.getString(R.string.user_relation_status_single);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(com.ap…r_relation_status_single)");
        } else if (relationStatus == 2) {
            string2 = context.getString(R.string.user_relation_status_taken);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(com.ap…er_relation_status_taken)");
        } else if (relationStatus != 3) {
            string2 = str;
        } else {
            string2 = context.getString(R.string.user_relation_status_open);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(com.ap…ser_relation_status_open)");
        }
        textView2.setText(string2);
        TextView textView3 = this.M0;
        int orientation = this.f5489x0.getOrientation();
        Intrinsics.checkNotNullParameter(context, "context");
        if (orientation == 1) {
            str = context.getString(R.string.user_orientation_guys);
            Intrinsics.checkNotNullExpressionValue(str, "context.getString(com.ap…ng.user_orientation_guys)");
        } else if (orientation == 2) {
            str = context.getString(R.string.user_orientation_girls);
            Intrinsics.checkNotNullExpressionValue(str, "context.getString(com.ap…g.user_orientation_girls)");
        } else if (orientation == 3) {
            str = context.getString(R.string.user_orientation_both);
            Intrinsics.checkNotNullExpressionValue(str, "context.getString(com.ap…ng.user_orientation_both)");
        }
        textView3.setText(str);
        if (this.f5489x0.getUserMetaData().isVerified()) {
            this.H0.setVisibility(0);
        }
        if (this.f5489x0.getUserMetaData().getEmailVerificationRequired()) {
            Snackbar k10 = Snackbar.k(this.O0, R.string.email_verification_required, -2);
            k10.m(R.string.help, new x3.a(this, 10));
            k10.n();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.T0 = new CompositeDisposable();
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View W = super.W(layoutInflater, viewGroup, bundle);
        if (s0() instanceof HomeActivity) {
            this.f5487u0 = (NavigationViewModel) new z(s0(), this.f16000o0).a(NavigationViewModel.class);
        }
        Bundle bundle2 = this.f2019u;
        if (bundle2 != null) {
            this.f5488v0 = o.j(bundle2, "targetUserId");
            this.w0 = o.j(bundle2, "targetUserName");
        }
        this.B0 = (ImageView) W.findViewById(R.id.user_info_avatar);
        this.C0 = (TextView) W.findViewById(R.id.user_info_joined);
        this.D0 = (TextView) W.findViewById(R.id.user_info_lastlogin);
        this.E0 = (TextView) W.findViewById(R.id.user_info_watchcount);
        this.F0 = W.findViewById(R.id.container_user_profile_detailed_info);
        this.G0 = (ImageView) W.findViewById(R.id.user_info_showmore);
        this.I0 = (TextView) W.findViewById(R.id.user_info_name);
        this.H0 = (ImageView) W.findViewById(R.id.imageViewVerified);
        this.J0 = (TextView) W.findViewById(R.id.user_info_age);
        this.K0 = (TextView) W.findViewById(R.id.user_info_gender);
        this.L0 = (TextView) W.findViewById(R.id.user_info_relationshipstatus);
        this.M0 = (TextView) W.findViewById(R.id.user_info_interestedin);
        this.N0 = (TextView) W.findViewById(R.id.user_info_profileviewcount);
        this.G0.setOnClickListener(new View.OnClickListener(this) { // from class: d5.c

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ ProfileFragment f8774f;

            {
                this.f8774f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ProfileFragment profileFragment = this.f8774f;
                        int i10 = ProfileFragment.U0;
                        profileFragment.N0("UserVideoListingsFragment");
                        t3.a.y("user_videos");
                        return;
                    default:
                        ProfileFragment profileFragment2 = this.f8774f;
                        if (profileFragment2.F0.getVisibility() == 0) {
                            profileFragment2.G0.setImageDrawable(profileFragment2.E().getDrawable(R.drawable.arrow_info_expand));
                            profileFragment2.F0.setVisibility(8);
                            t3.a.y("profile_expand");
                            return;
                        }
                        profileFragment2.G0.setImageDrawable(profileFragment2.E().getDrawable(R.drawable.arrow_info_close));
                        profileFragment2.F0.setVisibility(0);
                        t3.a.y("profile_collapse");
                        return;
                }
            }
        });
        W.findViewById(R.id.user_info_videos_container).setOnClickListener(new View.OnClickListener(this) { // from class: d5.c

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ ProfileFragment f8774f;

            {
                this.f8774f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ProfileFragment profileFragment = this.f8774f;
                        int i10 = ProfileFragment.U0;
                        profileFragment.N0("UserVideoListingsFragment");
                        t3.a.y("user_videos");
                        return;
                    default:
                        ProfileFragment profileFragment2 = this.f8774f;
                        if (profileFragment2.F0.getVisibility() == 0) {
                            profileFragment2.G0.setImageDrawable(profileFragment2.E().getDrawable(R.drawable.arrow_info_expand));
                            profileFragment2.F0.setVisibility(8);
                            t3.a.y("profile_expand");
                            return;
                        }
                        profileFragment2.G0.setImageDrawable(profileFragment2.E().getDrawable(R.drawable.arrow_info_close));
                        profileFragment2.F0.setVisibility(0);
                        t3.a.y("profile_collapse");
                        return;
                }
            }
        });
        W.findViewById(R.id.user_info_photos_container).setOnClickListener(new u3.b(this, 11));
        W.findViewById(R.id.user_info_friends_container).setOnClickListener(new u3.c(this, 13));
        ViewGroup viewGroup2 = (ViewGroup) W.findViewById(R.id.profile_root_view);
        this.O0 = (TextView) W.findViewById(R.id.user_info_label_wall);
        this.P0 = (TextView) W.findViewById(R.id.error_text);
        if (this.f5484r0.a().equals(this.f5488v0)) {
            this.S0 = I(R.string.menu_my_profile);
            this.O0.setText(R.string.my_wall);
            t3.a.x(q(), "Home", "MyProfile");
        } else {
            this.S0 = String.format("%s's %s", this.w0, I(R.string.profile));
            this.O0.setText(String.format("%s's %s", this.w0, I(R.string.wall)));
            t3.a.x(q(), "Home", "UserProfile");
        }
        this.f5490y0 = (RecyclerView) W.findViewById(R.id.recyclerview);
        n();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.A0 = linearLayoutManager;
        this.f5490y0.setLayoutManager(linearLayoutManager);
        this.f5490y0.g(new c(n()));
        this.f5490y0.h(new b(null));
        return W;
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.R0 = false;
        this.T0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        this.U = true;
        if (n() instanceof ProfileActivity) {
            String str = this.S0;
            TextView textView = (TextView) ((ProfileActivity) n()).K.findViewById(R.id.toolbar_title);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        this.U = true;
        if (this.f5489x0 == null) {
            kf.a.f12078a.e("Requesting user profile", new Object[0]);
            n3.b bVar = this.f5485s0;
            String targetUserId = this.f5488v0;
            Objects.requireNonNull(bVar);
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            Observable startWith = bVar.f13283a.a(targetUserId).toObservable().map(y.H).onErrorReturn(i1.D).startWith((Observable) UseCaseResult.a.f4910a);
            Intrinsics.checkNotNullExpressionValue(startWith, "userRepository.getUser(t…th(UseCaseResult.Loading)");
            this.T0.add(startWith.subscribe(new x2.h(this, 13)));
        } else {
            P0();
        }
        com.app.pornhub.view.user.b bVar2 = this.f5491z0;
        if (bVar2 != null && bVar2.a() != 0) {
            this.f5490y0.setAdapter(this.f5491z0);
            return;
        }
        com.app.pornhub.view.user.b bVar3 = new com.app.pornhub.view.user.b(s0(), this);
        this.f5491z0 = bVar3;
        this.Q0 = true;
        this.f5490y0.setAdapter(bVar3);
        M0();
    }
}
