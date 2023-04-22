package q0;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Objects;
import l0.b;

/* loaded from: classes2.dex */
public final class h {

    /* loaded from: classes2.dex */
    public static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f14166a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f14167b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f14168c;
        public Method d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14169e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f14170f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f14166a = callback;
            this.f14167b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f14166a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f14166a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f14166a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(18:1|(17:3|4|5|7|8|(1:72)(1:12)|13|14|(4:17|(2:21|22)|23|15)|27|28|(1:30)(3:49|(6:52|(5:54|(2:64|(1:68))(1:56)|57|(3:59|60|61)(1:63)|62)|70|(0)(0)|62|50)|71)|31|(4:34|(2:43|44)(2:40|41)|42|32)|45|46|47)|75|7|8|(1:10)|72|13|14|(1:15)|27|28|(0)(0)|31|(1:32)|45|46|47) */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169, TRY_ENTER, TryCatch #1 {IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169, blocks: (B:9:0x003e, B:11:0x0043, B:13:0x004c, B:15:0x0060, B:19:0x006b, B:21:0x0077, B:23:0x0087, B:14:0x004f), top: B:65:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00fa A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00be A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h.a.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    public static b.a a(TextView textView) {
        int i10;
        int i11;
        TextDirectionHeuristic textDirectionHeuristic;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            return new b.a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 1;
            i11 = 1;
        } else {
            i10 = 0;
            i11 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i12 >= 23) {
            i10 = textView.getBreakStrategy();
            i11 = textView.getHyphenationFrequency();
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i12 < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z10 = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (!z10) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        }
        return new b.a(textPaint, textDirectionHeuristic, i10, i11);
    }

    public static void b(TextView textView, int i10) {
        cb.e.s(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i10) {
        cb.e.s(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void d(TextView textView, int i10) {
        cb.e.s(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void e(TextView textView, l0.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(bVar);
            textView.setText((CharSequence) null);
            return;
        }
        b.a a10 = a(textView);
        Objects.requireNonNull(bVar);
        if (!a10.a(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(bVar);
    }

    public static void f(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static ActionMode.Callback g(ActionMode.Callback callback) {
        return (!(callback instanceof a) || Build.VERSION.SDK_INT < 26) ? callback : ((a) callback).f14166a;
    }

    public static ActionMode.Callback h(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}
