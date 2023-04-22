package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemPlaylistBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4746a;

    public ItemPlaylistBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, ImageView imageView4, TextView textView3, Space space, Space space2, View view, TextView textView4, ImageView imageView5, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f4746a = constraintLayout;
    }

    public static ItemPlaylistBinding bind(View view) {
        int i10 = R.id.guide_50;
        Guideline guideline = (Guideline) b.t(view, R.id.guide_50);
        if (guideline != null) {
            i10 = R.id.guide_75;
            Guideline guideline2 = (Guideline) b.t(view, R.id.guide_75);
            if (guideline2 != null) {
                i10 = R.id.plsIcLikes;
                ImageView imageView = (ImageView) b.t(view, R.id.plsIcLikes);
                if (imageView != null) {
                    i10 = R.id.plsIcRating;
                    ImageView imageView2 = (ImageView) b.t(view, R.id.plsIcRating);
                    if (imageView2 != null) {
                        i10 = R.id.plsIcViewCount;
                        ImageView imageView3 = (ImageView) b.t(view, R.id.plsIcViewCount);
                        if (imageView3 != null) {
                            i10 = R.id.plsLikes;
                            TextView textView = (TextView) b.t(view, R.id.plsLikes);
                            if (textView != null) {
                                i10 = R.id.plsPlayAll;
                                TextView textView2 = (TextView) b.t(view, R.id.plsPlayAll);
                                if (textView2 != null) {
                                    i10 = R.id.plsPlaylistIcon;
                                    ImageView imageView4 = (ImageView) b.t(view, R.id.plsPlaylistIcon);
                                    if (imageView4 != null) {
                                        i10 = R.id.plsRating;
                                        TextView textView3 = (TextView) b.t(view, R.id.plsRating);
                                        if (textView3 != null) {
                                            i10 = R.id.plsSpaceBottom;
                                            Space space = (Space) b.t(view, R.id.plsSpaceBottom);
                                            if (space != null) {
                                                i10 = R.id.plsSpaceTop;
                                                Space space2 = (Space) b.t(view, R.id.plsSpaceTop);
                                                if (space2 != null) {
                                                    i10 = R.id.plsStatsBg;
                                                    View t2 = b.t(view, R.id.plsStatsBg);
                                                    if (t2 != null) {
                                                        i10 = R.id.plsThreeDot;
                                                        TextView textView4 = (TextView) b.t(view, R.id.plsThreeDot);
                                                        if (textView4 != null) {
                                                            i10 = R.id.plsThumb;
                                                            ImageView imageView5 = (ImageView) b.t(view, R.id.plsThumb);
                                                            if (imageView5 != null) {
                                                                i10 = R.id.plsTitle;
                                                                TextView textView5 = (TextView) b.t(view, R.id.plsTitle);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.plsVideos;
                                                                    TextView textView6 = (TextView) b.t(view, R.id.plsVideos);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.plsVideosCount;
                                                                        TextView textView7 = (TextView) b.t(view, R.id.plsVideosCount);
                                                                        if (textView7 != null) {
                                                                            i10 = R.id.plsViewCount;
                                                                            TextView textView8 = (TextView) b.t(view, R.id.plsViewCount);
                                                                            if (textView8 != null) {
                                                                                return new ItemPlaylistBinding((ConstraintLayout) view, guideline, guideline2, imageView, imageView2, imageView3, textView, textView2, imageView4, textView3, space, space2, t2, textView4, imageView5, textView5, textView6, textView7, textView8);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPlaylistBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_playlist, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4746a;
    }
}
