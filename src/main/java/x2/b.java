package x2;

import android.widget.Toast;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.CommentsConfig;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.error.NetworkException;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.comments.a;
import com.app.pornhub.view.home.albums.AlbumsViewModel;
import com.app.pornhub.view.home.categories.b;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import com.app.pornhub.view.home.gifs.GifListingsFragment;
import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import com.app.pornhub.view.launch.LaunchViewModel;
import com.app.pornhub.view.login.LoginViewModel;
import com.app.pornhub.view.user.ProfileFragment;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17681c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17682f;

    public /* synthetic */ b(Object obj, int i10) {
        this.f17681c = i10;
        this.f17682f = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17681c) {
            case 0:
                f this$0 = (f) this.f17682f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.d;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            case 1:
                o0 this$02 = (o0) this.f17682f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17825e;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
            case 2:
                r0 this$03 = (r0) this.f17682f;
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                y2.a aVar3 = this$03.f17844c;
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                throw aVar3.a(it3);
            case 3:
                t0 this$04 = (t0) this.f17682f;
                Throwable it4 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                y2.a aVar4 = this$04.f17861c;
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                throw aVar4.a(it4);
            case 4:
                s1 this$05 = (s1) this.f17682f;
                Throwable it5 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                y2.a aVar5 = this$05.f17854e;
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                throw aVar5.a(it5);
            case 5:
                CommentsFragment commentsFragment = (CommentsFragment) this.f17682f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = CommentsFragment.M0;
                Objects.requireNonNull(commentsFragment);
                if (useCaseResult instanceof UseCaseResult.a) {
                    commentsFragment.C0.f4661f.setVisibility(4);
                    commentsFragment.C0.f4662g.setVisibility(0);
                } else {
                    commentsFragment.C0.f4661f.setVisibility(0);
                    commentsFragment.C0.f4662g.setVisibility(8);
                }
                if (useCaseResult instanceof UseCaseResult.Result) {
                    CommentActionResult commentActionResult = (CommentActionResult) ((UseCaseResult.Result) useCaseResult).a();
                    if (commentActionResult.getResult()) {
                        UserComment userComment = new UserComment(commentActionResult.getCommentId(), commentsFragment.C0.f4659c.getText().toString().trim(), System.currentTimeMillis() / 1000, 0, 0, new ArrayList(), commentsFragment.f4936q0.a());
                        com.app.pornhub.view.comments.a aVar6 = commentsFragment.J0;
                        Objects.requireNonNull(aVar6);
                        aVar6.d.add(0, new a.c(userComment));
                        aVar6.e(0);
                        commentsFragment.C0.f4659c.setText(BuildConfig.FLAVOR);
                        commentsFragment.P0();
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.I(R.string.comment_sent), -1).n();
                    } else {
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.I(R.string.error_post_comment), -1).n();
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult).a();
                    kf.a.f12078a.d(a10, "Unable to post a comment", new Object[0]);
                    if (a10 instanceof OperationException) {
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.L0((OperationException) a10), -1).n();
                        return;
                    } else {
                        t3.o.h(commentsFragment.u0(), a10);
                        return;
                    }
                }
                return;
            case 6:
                AlbumsViewModel this$06 = (AlbumsViewModel) this.f17682f;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    this$06.f5080s.l(new z3.a<>(AlbumsViewModel.State.d.f5084a));
                    return;
                } else if (useCaseResult2 instanceof UseCaseResult.Result) {
                    if (!this$06.d()) {
                        this$06.f5079r.addAll((Collection) ((UseCaseResult.Result) useCaseResult2).a());
                    }
                    this$06.f5080s.l(new z3.a<>(new AlbumsViewModel.State.LoadingDone((List) ((UseCaseResult.Result) useCaseResult2).a())));
                    return;
                } else if (useCaseResult2 instanceof UseCaseResult.Failure) {
                    this$06.f5080s.l(new z3.a<>(new AlbumsViewModel.State.LoadingError(((UseCaseResult.Failure) useCaseResult2).a())));
                    return;
                } else {
                    return;
                }
            case 7:
                com.app.pornhub.view.home.categories.b this$07 = (com.app.pornhub.view.home.categories.b) this.f17682f;
                UseCaseResult useCaseResult3 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.f5121j.l(new z3.a<>(new b.a.C0052a(useCaseResult3 instanceof UseCaseResult.a)));
                if (useCaseResult3 instanceof UseCaseResult.Result) {
                    this$07.f5123l.l(((UseCaseResult.Result) useCaseResult3).a());
                    return;
                } else if (useCaseResult3 instanceof UseCaseResult.Failure) {
                    this$07.f5121j.l(new z3.a<>(b.a.c.f5126a));
                    return;
                } else {
                    return;
                }
            case 8:
                m4.d dVar = (m4.d) this.f17682f;
                UserOrientation userOrientation = (UserOrientation) obj;
                if (dVar.B0 == null) {
                    dVar.B0 = userOrientation;
                    return;
                } else if (dVar.P()) {
                    dVar.K0();
                    return;
                } else {
                    dVar.C0 = null;
                    return;
                }
            case 9:
                ExploreFragmentViewModel this$08 = (ExploreFragmentViewModel) this.f17682f;
                UseCaseResult useCaseResult4 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (useCaseResult4 instanceof UseCaseResult.Result) {
                    this$08.f5173k.l(new z3.a<>(((UseCaseResult.Result) useCaseResult4).a()));
                    return;
                } else if (useCaseResult4 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.a("Promo banner not available", new Object[0]);
                    return;
                } else {
                    return;
                }
            case 10:
                GifListingsFragment gifListingsFragment = (GifListingsFragment) this.f17682f;
                UseCaseResult useCaseResult5 = (UseCaseResult) obj;
                int i11 = GifListingsFragment.P0;
                Objects.requireNonNull(gifListingsFragment);
                if (useCaseResult5 instanceof UseCaseResult.a) {
                    gifListingsFragment.S0();
                } else {
                    gifListingsFragment.T0();
                }
                if (useCaseResult5 instanceof UseCaseResult.Result) {
                    List<GifMetaData> list = (List) ((UseCaseResult.Result) useCaseResult5).a();
                    kf.a.f12078a.a("Got %s gifs", Integer.valueOf(list.size()));
                    gifListingsFragment.f8761q0 = GifsConfig.Companion.hasMoreGifs(list.size());
                    gifListingsFragment.X0(gifListingsFragment.F0, list);
                    gifListingsFragment.R0();
                }
                if (useCaseResult5 instanceof UseCaseResult.Failure) {
                    Throwable a11 = ((UseCaseResult.Failure) useCaseResult5).a();
                    kf.a.f12078a.d(a11, "Error loading gifs", new Object[0]);
                    if (a11 instanceof PornhubException) {
                        PornhubException pornhubException = (PornhubException) a11;
                        if (t3.o.l(pornhubException.a())) {
                            gifListingsFragment.C0.q(pornhubException.a());
                            return;
                        }
                    }
                    if (gifListingsFragment.F0.a() == 0) {
                        gifListingsFragment.V0(t3.o.h(gifListingsFragment.u0(), a11), UsersConfig.isGay(gifListingsFragment.E0.getOrientation()));
                        return;
                    }
                    t3.o.h(gifListingsFragment.u0(), a11);
                    Snackbar.k(gifListingsFragment.f8767x0, R.string.error_loading_more_gifs, 0).n();
                    return;
                }
                return;
            case 11:
                PerformersViewModel this$09 = (PerformersViewModel) this.f17682f;
                Map<String, String> map = (Map) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                this$09.f5315x.l(new z3.a<>(new PerformersViewModel.State.c(map.size(), map != this$09.f5312u)));
                return;
            case 12:
                LaunchViewModel this$010 = (LaunchViewModel) this.f17682f;
                UseCaseResult useCaseResult6 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                if (useCaseResult6 instanceof UseCaseResult.Result) {
                    PublishSubject<Boolean> publishSubject = this$010.f5375m;
                    String accessToken = ((UserMetaData) ((UseCaseResult.Result) useCaseResult6).a()).getAccessToken();
                    publishSubject.onNext(Boolean.valueOf(!((accessToken == null || accessToken.length() == 0) ? true : true)));
                    return;
                } else if (useCaseResult6 instanceof UseCaseResult.Failure) {
                    this$010.f5375m.onNext(Boolean.FALSE);
                    return;
                } else {
                    return;
                }
            case 13:
                LoginViewModel this$011 = (LoginViewModel) this.f17682f;
                UseCaseResult result = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof UseCaseResult.a) {
                    this$011.f5400l.l(new z3.a<>(LoginViewModel.LoginResult.b.f5402a));
                    return;
                } else if (result instanceof UseCaseResult.Result) {
                    this$011.c((UserMetaData) ((UseCaseResult.Result) result).a());
                    return;
                } else if (result instanceof UseCaseResult.Failure) {
                    UseCaseResult.Failure failure = (UseCaseResult.Failure) result;
                    kf.a.f12078a.d(failure.a(), "Error user login", new Object[0]);
                    if (failure.a() instanceof PornhubException) {
                        PornhubException pornhubException2 = (PornhubException) failure.a();
                        int a12 = pornhubException2.a();
                        if (a12 == 96) {
                            this$011.f5400l.l(new z3.a<>(LoginViewModel.LoginResult.a.f5401a));
                            return;
                        } else if (a12 != 114) {
                            this$011.f5400l.l(new z3.a<>(new LoginViewModel.LoginResult.c(pornhubException2.a())));
                            return;
                        } else {
                            androidx.lifecycle.p<z3.a<LoginViewModel.LoginResult>> pVar = this$011.f5400l;
                            String message = pornhubException2.getMessage();
                            Intrinsics.checkNotNull(message);
                            pVar.l(new z3.a<>(new LoginViewModel.LoginResult.TwoFactorAuth(message)));
                            return;
                        }
                    } else if (!(failure.a() instanceof CompositeException)) {
                        this$011.f5400l.l(new z3.a<>(new LoginViewModel.LoginResult.c(115)));
                        return;
                    } else {
                        List<Throwable> exceptions = ((CompositeException) failure.a()).getExceptions();
                        Intrinsics.checkNotNullExpressionValue(exceptions, "error.exceptions");
                        if (!(exceptions instanceof Collection) || !exceptions.isEmpty()) {
                            Iterator<T> it6 = exceptions.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (((Throwable) it6.next()) instanceof NetworkException) {
                                        r1 = true;
                                    }
                                }
                            }
                        }
                        if (r1) {
                            this$011.f5400l.l(new z3.a<>(new LoginViewModel.LoginResult.c(116)));
                            return;
                        } else {
                            this$011.f5400l.l(new z3.a<>(new LoginViewModel.LoginResult.c(115)));
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 14:
                ProfileFragment profileFragment = (ProfileFragment) this.f17682f;
                UseCaseResult useCaseResult7 = (UseCaseResult) obj;
                int i12 = ProfileFragment.U0;
                Objects.requireNonNull(profileFragment);
                if (useCaseResult7 instanceof UseCaseResult.a) {
                    profileFragment.R0 = true;
                    profileFragment.f5491z0.a();
                } else {
                    profileFragment.R0 = false;
                }
                if (useCaseResult7 instanceof UseCaseResult.Result) {
                    List list2 = (List) ((UseCaseResult.Result) useCaseResult7).a();
                    profileFragment.Q0 = CommentsConfig.Companion.hasMoreWallComments(list2.size());
                    com.app.pornhub.view.user.b bVar = profileFragment.f5491z0;
                    int size = bVar.f5531f.size();
                    bVar.f5531f.addAll(list2);
                    bVar.f2802a.e(size, list2.size());
                    if (profileFragment.f5491z0.a() == 0) {
                        profileFragment.O0(profileFragment.I(R.string.no_wall_messages));
                    }
                }
                if (useCaseResult7 instanceof UseCaseResult.Failure) {
                    Throwable a13 = ((UseCaseResult.Failure) useCaseResult7).a();
                    kf.a.f12078a.d(a13, "Error loading wall comments", new Object[0]);
                    if (a13 instanceof PornhubException) {
                        profileFragment.O0(((PornhubException) a13).a() == 15 ? profileFragment.I(R.string.error_user_comments_view) : profileFragment.I(R.string.error));
                        return;
                    } else if (profileFragment.f5491z0.a() == 0) {
                        profileFragment.O0(t3.o.h(profileFragment.u0(), a13));
                        return;
                    } else {
                        Toast.makeText(profileFragment.n(), profileFragment.I(R.string.error_loading_more_albums), 0).show();
                        return;
                    }
                }
                return;
            default:
                e5.b0 b0Var = (e5.b0) this.f17682f;
                UseCaseResult useCaseResult8 = (UseCaseResult) obj;
                int i13 = e5.b0.G0;
                Objects.requireNonNull(b0Var);
                if (useCaseResult8 instanceof UseCaseResult.a) {
                    b0Var.S0();
                } else {
                    b0Var.T0();
                }
                if (useCaseResult8 instanceof UseCaseResult.Result) {
                    List<VideoMetaData> list3 = (List) ((UseCaseResult.Result) useCaseResult8).a();
                    kf.a.f12078a.a("Got %s related videos", Integer.valueOf(list3.size()));
                    b0Var.f8761q0 = VideosConfig.Companion.hasMoreRelatedVideos(list3.size());
                    b0Var.D0.q(list3);
                    b0Var.R0();
                }
                if (useCaseResult8 instanceof UseCaseResult.Failure) {
                    Throwable a14 = ((UseCaseResult.Failure) useCaseResult8).a();
                    kf.a.f12078a.d(a14, "Error loading videos", new Object[0]);
                    b0Var.V0(t3.o.h(b0Var.u0(), a14), UsersConfig.isGay(b0Var.f9063z0.a().getOrientation()));
                    return;
                }
                return;
        }
    }
}
