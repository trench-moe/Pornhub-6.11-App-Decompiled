package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f377c;

    /* renamed from: f  reason: collision with root package name */
    public final float f378f;

    /* renamed from: j  reason: collision with root package name */
    public Object f379j;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        public static Rating h(float f10) {
            return Rating.newPercentageRating(f10);
        }

        public static Rating i(int i10, float f10) {
            return Rating.newStarRating(i10, f10);
        }

        public static Rating j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        public static Rating k(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    public RatingCompat(int i10, float f10) {
        this.f377c = i10;
        this.f378f = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        float f10;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b10 = b.b(rating);
            if (!b.e(rating)) {
                switch (b10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(b10, -1.0f);
                        break;
                }
            } else {
                float f11 = 1.0f;
                switch (b10) {
                    case 1:
                        if (!b.d(rating)) {
                            f11 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f11);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        if (!b.f(rating)) {
                            f11 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f11);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c10 = b.c(rating);
                        if (b10 == 3) {
                            f10 = 3.0f;
                        } else if (b10 == 4) {
                            f10 = 4.0f;
                        } else if (b10 != 5) {
                            Log.e("Rating", "Invalid rating style (" + b10 + ") for a star rating");
                            break;
                        } else {
                            f10 = 5.0f;
                        }
                        if (c10 >= 0.0f && c10 <= f10) {
                            ratingCompat2 = new RatingCompat(b10, c10);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float a10 = b.a(rating);
                        if (a10 >= 0.0f && a10 <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, a10);
                            break;
                        }
                        Log.e("Rating", "Invalid percentage-based rating value");
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f379j = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f377c;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Rating:style=");
        m10.append(this.f377c);
        m10.append(" rating=");
        float f10 = this.f378f;
        m10.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f377c);
        parcel.writeFloat(this.f378f);
    }
}
