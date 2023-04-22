package com.app.pornhub.view.comments;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.databinding.ItemVideoCommentBinding;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.CommentsSource;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.ChildCommentsActivity;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.user.ProfileActivity;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Objects;
import t3.o;

/* loaded from: classes.dex */
public class a extends c4.a<c> {

    /* renamed from: e  reason: collision with root package name */
    public b f4952e;

    /* renamed from: f  reason: collision with root package name */
    public String f4953f;

    /* renamed from: g  reason: collision with root package name */
    public String f4954g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4955h;

    /* renamed from: i  reason: collision with root package name */
    public CommentsSource f4956i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f4957j;

    /* renamed from: com.app.pornhub.view.comments.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0051a implements View.OnClickListener {
        public View$OnClickListenerC0051a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = (String) view.getTag();
            switch (view.getId()) {
                case R.id.icon_delete /* 2131362416 */:
                    b bVar = a.this.f4952e;
                    final String valueOf = String.valueOf(str);
                    final CommentsFragment commentsFragment = (CommentsFragment) bVar;
                    commentsFragment.G0.add(commentsFragment.f4941v0.a(valueOf, commentsFragment.I0).subscribe(new Consumer() { // from class: y3.e
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            CommentsFragment commentsFragment2 = CommentsFragment.this;
                            String str2 = valueOf;
                            UseCaseResult useCaseResult = (UseCaseResult) obj;
                            int i10 = CommentsFragment.M0;
                            Objects.requireNonNull(commentsFragment2);
                            if (useCaseResult instanceof UseCaseResult.a) {
                                commentsFragment2.J0.v(str2, true);
                            } else {
                                commentsFragment2.J0.v(str2, false);
                            }
                            if (useCaseResult instanceof UseCaseResult.Result) {
                                if (((CommentActionResult) ((UseCaseResult.Result) useCaseResult).a()).getResult()) {
                                    commentsFragment2.J0.t(str2);
                                    a0.a.s(commentsFragment2, R.string.comment_deleted, commentsFragment2.C0.f4669o, -1);
                                } else {
                                    a0.a.s(commentsFragment2, R.string.error_comment_delete, commentsFragment2.C0.f4669o, -1);
                                }
                            }
                            if (useCaseResult instanceof UseCaseResult.Failure) {
                                Throwable a10 = ((UseCaseResult.Failure) useCaseResult).a();
                                kf.a.f12078a.d(a10, "Failed to delete comment id %s", str2);
                                if (a10 instanceof OperationException) {
                                    Snackbar.l(commentsFragment2.C0.f4669o, commentsFragment2.L0((OperationException) a10), -1).n();
                                } else {
                                    o.h(commentsFragment2.u0(), a10);
                                }
                            }
                        }
                    }));
                    return;
                case R.id.icon_flag /* 2131362417 */:
                    b bVar2 = a.this.f4952e;
                    String valueOf2 = String.valueOf(str);
                    CommentsFragment commentsFragment2 = (CommentsFragment) bVar2;
                    commentsFragment2.G0.add(commentsFragment2.f4939t0.a(valueOf2, commentsFragment2.I0).subscribe(new y3.b(commentsFragment2, valueOf2, 1)));
                    return;
                case R.id.img_reply /* 2131362451 */:
                    a.r(a.this, view, ChildCommentsActivity.Type.REPLY);
                    return;
                case R.id.img_vote_down /* 2131362453 */:
                    a.q(a.this, str, false);
                    return;
                case R.id.img_vote_up /* 2131362454 */:
                    a.q(a.this, str, true);
                    return;
                case R.id.reply_comment_text /* 2131362870 */:
                case R.id.reply_user_name /* 2131362872 */:
                    a.r(a.this, view, ChildCommentsActivity.Type.SCROLL_TOP);
                    return;
                case R.id.user_name /* 2131363165 */:
                    UserComment s10 = a.this.s(str);
                    if (s10 != null) {
                        view.getContext().startActivity(ProfileActivity.C(view.getContext(), s10.getUser()));
                        return;
                    }
                    return;
                case R.id.view_previous_replies /* 2131363204 */:
                    a.r(a.this, view, ChildCommentsActivity.Type.SCROLL_BOTTOM);
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public UserComment f4959a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4960b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4961c;
        public boolean d;

        public c(UserComment userComment) {
            this.f4959a = userComment;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemVideoCommentBinding f4962u;

        public d(ItemVideoCommentBinding itemVideoCommentBinding, View.OnClickListener onClickListener) {
            super(itemVideoCommentBinding.f4804a);
            itemVideoCommentBinding.f4808f.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4807e.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4812j.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4811i.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4810h.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4817p.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4815m.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4813k.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4816o.setOnClickListener(onClickListener);
            this.f4962u = itemVideoCommentBinding;
        }
    }

    public a(b bVar, String str, String str2, boolean z10, CommentsSource commentsSource) {
        super(new ArrayList());
        this.f4957j = new View$OnClickListenerC0051a();
        this.f4952e = bVar;
        this.f4953f = str;
        this.f4954g = str2;
        this.f4955h = z10;
        this.f4956i = commentsSource;
    }

    public static void q(a aVar, String str, boolean z10) {
        UserComment s10 = aVar.s(str);
        if (s10 == null || aVar.f4954g.equals(s10.getUser().getId())) {
            return;
        }
        b bVar = aVar.f4952e;
        String valueOf = String.valueOf(str);
        CommentsFragment commentsFragment = (CommentsFragment) bVar;
        commentsFragment.G0.add(commentsFragment.f4940u0.b(valueOf, z10).subscribe(new y3.d(commentsFragment, valueOf, z10)));
    }

    public static void r(a aVar, View view, ChildCommentsActivity.Type type) {
        String str;
        Objects.requireNonNull(aVar);
        String str2 = (String) view.getTag();
        if (aVar.s(str2) != null) {
            Context context = view.getContext();
            String str3 = aVar.f4953f;
            CommentsSource commentsSource = aVar.f4956i;
            int i10 = ChildCommentsActivity.Z;
            Intent intent = new Intent();
            intent.setClass(context, ChildCommentsActivity.class);
            intent.putExtra("view_type", type);
            intent.putExtra("parent_id", str2);
            intent.putExtra("unit_id", str3);
            if (commentsSource instanceof CommentsSource.Video) {
                str = "video";
            } else if (!(commentsSource instanceof CommentsSource.Gif)) {
                throw new IllegalArgumentException("Comment source type not supported!");
            } else {
                str = ExploreModel.GIF;
            }
            intent.putExtra("source", str);
            context.startActivity(intent);
        }
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        d dVar = (d) zVar;
        c cVar = (c) this.d.get(i10);
        boolean z10 = this.f4955h;
        String str = this.f4954g;
        Objects.requireNonNull(dVar);
        UserComment userComment = cVar.f4959a;
        com.bumptech.glide.b.e(dVar.f4962u.n).o(userComment.getUser().getUrlThumbnail()).A(dVar.f4962u.n);
        dVar.f4962u.f4816o.setText(userComment.getUser().getUsername());
        dVar.f4962u.f4816o.setTag(userComment.getId());
        dVar.f4962u.f4809g.setVisibility(userComment.getUser().isVerified() ? 0 : 8);
        dVar.f4962u.f4805b.setText(a0.b.x(userComment.getDateAdded()));
        dVar.f4962u.f4806c.setText(Html.fromHtml(userComment.getText()).toString().replaceAll("￼", BuildConfig.FLAVOR));
        if (cVar.f4960b) {
            dVar.f4962u.f4820s.setVisibility(4);
            dVar.f4962u.f4821t.setVisibility(0);
        } else {
            dVar.f4962u.f4820s.setVisibility(0);
            dVar.f4962u.f4821t.setVisibility(4);
            dVar.f4962u.f4820s.setText(String.valueOf(userComment.getVotesUp()));
        }
        if (cVar.f4961c) {
            dVar.f4962u.f4818q.setVisibility(4);
            dVar.f4962u.f4819r.setVisibility(0);
        } else {
            dVar.f4962u.f4818q.setVisibility(0);
            dVar.f4962u.f4819r.setVisibility(4);
            dVar.f4962u.f4818q.setText(String.valueOf(userComment.getVotesDown()));
        }
        dVar.f4962u.f4812j.setTag(userComment.getId());
        dVar.f4962u.f4811i.setTag(userComment.getId());
        if (!z10 || str.equals(userComment.getUser().getId())) {
            dVar.f4962u.f4810h.setVisibility(4);
        } else {
            dVar.f4962u.f4810h.setTag(userComment.getId());
            dVar.f4962u.f4810h.setVisibility(0);
        }
        if (cVar.d) {
            dVar.f4962u.f4807e.setVisibility(4);
            dVar.f4962u.f4808f.setVisibility(4);
            dVar.f4962u.d.setVisibility(0);
        } else if (userComment.getUser().getId().equals(str)) {
            dVar.f4962u.f4807e.setTag(userComment.getId());
            dVar.f4962u.f4807e.setVisibility(0);
            dVar.f4962u.f4808f.setVisibility(4);
            dVar.f4962u.d.setVisibility(8);
        } else if (str.equals(userComment.getUser().getId())) {
            dVar.f4962u.f4808f.setVisibility(8);
            dVar.f4962u.d.setVisibility(8);
        } else {
            dVar.f4962u.f4808f.setTag(userComment.getId());
            dVar.f4962u.f4807e.setVisibility(4);
            dVar.f4962u.f4808f.setVisibility(0);
            dVar.f4962u.d.setVisibility(4);
        }
        if (userComment.getChildren().size() <= 0) {
            dVar.f4962u.f4817p.setVisibility(8);
            dVar.f4962u.f4814l.setVisibility(8);
            dVar.f4962u.f4815m.setVisibility(8);
            dVar.f4962u.f4813k.setVisibility(8);
            return;
        }
        dVar.f4962u.f4817p.setVisibility(0);
        TextView textView = dVar.f4962u.f4817p;
        textView.setText(textView.getContext().getString(R.string.view_x_previous_replies, String.valueOf(userComment.getChildren().size())));
        dVar.f4962u.f4817p.setTag(userComment.getId());
        com.bumptech.glide.b.e(dVar.f4962u.f4814l).o(userComment.getChildren().get(0).getUser().getUrlThumbnail()).A(dVar.f4962u.f4814l);
        dVar.f4962u.f4815m.setText(userComment.getChildren().get(0).getUser().getUsername());
        dVar.f4962u.f4813k.setText(userComment.getChildren().get(0).getText());
        dVar.f4962u.f4814l.setVisibility(0);
        dVar.f4962u.f4815m.setTag(userComment.getId());
        dVar.f4962u.f4815m.setVisibility(0);
        dVar.f4962u.f4813k.setTag(userComment.getId());
        dVar.f4962u.f4813k.setVisibility(0);
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new d(ItemVideoCommentBinding.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f4957j);
    }

    public final UserComment s(String str) {
        for (T t2 : this.d) {
            if (t2.f4959a.getId().equals(str)) {
                return t2.f4959a;
            }
        }
        return null;
    }

    public void t(String str) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.d.size()) {
                i10 = -1;
                break;
            } else if (((c) this.d.get(i10)).f4959a.getId().equals(str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            this.d.remove(i10);
            f(i10);
        }
    }

    public void u(String str, boolean z10, boolean z11) {
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            c cVar = (c) this.d.get(i10);
            if (cVar.f4959a.getId().equals(str)) {
                if (z10) {
                    cVar.f4960b = z11;
                } else {
                    cVar.f4961c = z11;
                }
                if (z11) {
                    this.f2802a.b();
                    return;
                } else {
                    d(i10);
                    return;
                }
            }
        }
    }

    public void v(String str, boolean z10) {
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            c cVar = (c) this.d.get(i10);
            if (cVar.f4959a.getId().equals(str)) {
                cVar.d = z10;
                if (z10) {
                    this.f2802a.b();
                    return;
                } else {
                    d(i10);
                    return;
                }
            }
        }
    }
}
