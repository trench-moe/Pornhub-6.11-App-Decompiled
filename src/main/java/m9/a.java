package m9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import b7.k;
import bf.f;
import bf.h;
import cb.d;
import cb.g;
import cb.j;
import com.app.pornhub.R;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.google.android.gms.internal.measurement.zzix;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.internal.http2.ErrorCode;
import okio.SegmentedByteString;
import org.xmlpull.v1.XmlPullParser;
import t9.o1;
import ua.n;
import we.p;

/* loaded from: classes2.dex */
public class a implements o1, ea.a, p {

    /* renamed from: c  reason: collision with root package name */
    public static Context f13001c;

    /* renamed from: f  reason: collision with root package name */
    public static Boolean f13005f;

    /* renamed from: j  reason: collision with root package name */
    public static int f13010j;

    /* renamed from: m  reason: collision with root package name */
    public static int f13014m;
    public static float n;

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f13022t = {R.attr.lottie_autoPlay, R.attr.lottie_cacheComposition, R.attr.lottie_colorFilter, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_ignoreDisabledSystemAnimations, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_scale, R.attr.lottie_speed, R.attr.lottie_url};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f13024u = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f13027w = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};
    public static final int[] y = {R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeRadius, R.attr.badgeTextColor, R.attr.badgeWidePadding, R.attr.badgeWithTextRadius, R.attr.horizontalOffset, R.attr.horizontalOffsetWithText, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset, R.attr.verticalOffsetWithText};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f13030z = {16843065, R.attr.hideAnimationBehavior, R.attr.indicatorColor, R.attr.minHideDelay, R.attr.showAnimationBehavior, R.attr.showDelay, R.attr.trackColor, R.attr.trackCornerRadius, R.attr.trackThickness};
    public static final int[] A = {R.attr.backgroundTint, R.attr.elevation, R.attr.fabAlignmentMode, R.attr.fabAnimationMode, R.attr.fabCradleMargin, R.attr.fabCradleRoundedCornerRadius, R.attr.fabCradleVerticalOffset, R.attr.hideOnScroll, R.attr.navigationIconTint, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets};
    public static final int[] B = {16843072, R.attr.itemHorizontalTranslationEnabled};
    public static final int[] C = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] D = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};
    public static final int[] E = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};
    public static final int[] F = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};
    public static final int[] G = {R.attr.indicatorDirectionCircular, R.attr.indicatorInset, R.attr.indicatorSize};
    public static final int[] H = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};
    public static final int[] I = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] J = {R.attr.collapsedTitleGravity, R.attr.collapsedTitleTextAppearance, R.attr.collapsedTitleTextColor, R.attr.contentScrim, R.attr.expandedTitleGravity, R.attr.expandedTitleMargin, R.attr.expandedTitleMarginBottom, R.attr.expandedTitleMarginEnd, R.attr.expandedTitleMarginStart, R.attr.expandedTitleMarginTop, R.attr.expandedTitleTextAppearance, R.attr.expandedTitleTextColor, R.attr.extraMultilineHeightEnabled, R.attr.forceApplySystemWindowInsetTop, R.attr.maxLines, R.attr.scrimAnimationDuration, R.attr.scrimVisibleHeightTrigger, R.attr.statusBarScrim, R.attr.title, R.attr.titleCollapseMode, R.attr.titleEnabled, R.attr.titlePositionInterpolator, R.attr.toolbarId};
    public static final int[] K = {R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier};
    public static final int[] L = {R.attr.collapsedSize, R.attr.elevation, R.attr.extendMotionSpec, R.attr.hideMotionSpec, R.attr.showMotionSpec, R.attr.shrinkMotionSpec};
    public static final int[] M = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] N = {16842766, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.borderWidth, R.attr.elevation, R.attr.ensureMinTouchTargetSize, R.attr.fabCustomSize, R.attr.fabSize, R.attr.hideMotionSpec, R.attr.hoveredFocusedTranslationZ, R.attr.maxImageSize, R.attr.pressedTranslationZ, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.useCompatPadding};
    public static final int[] O = {R.attr.behavior_autoHide};
    public static final int[] P = {R.attr.debugDraw, R.attr.horizontalSpacing, R.attr.itemSpacing, R.attr.lineSpacing, R.attr.orientation, R.attr.verticalSpacing};
    public static final int[] Q = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] R = {R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets};
    public static final int[] S = {R.attr.indeterminateAnimationType, R.attr.indicatorDirectionLinear};
    public static final int[] T = {16843296};
    public static final int[] U = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] V = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] W = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] X = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] Y = {16843237, R.attr.cardForegroundColor, R.attr.checkedIcon, R.attr.checkedIconMargin, R.attr.checkedIconSize, R.attr.checkedIconTint, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.state_dragged, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] Z = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f12999a0 = {R.attr.dividerColor, R.attr.dividerInsetEnd, R.attr.dividerInsetStart, R.attr.dividerThickness};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f13000b0 = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f13002c0 = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f13003d0 = {16843958, 16844159, R.attr.lineHeight};

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f13004e0 = {16842804, 16844159, R.attr.lineHeight};

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f13006f0 = {R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f13007g0 = {16843093, 16843097, 16843173, R.attr.marginHorizontal, R.attr.shapeAppearance};

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f13008h0 = {R.attr.backgroundTint, R.attr.elevation, R.attr.itemActiveIndicatorStyle, R.attr.itemBackground, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemPaddingBottom, R.attr.itemPaddingTop, R.attr.itemRippleColor, R.attr.itemTextAppearanceActive, R.attr.itemTextAppearanceInactive, R.attr.itemTextColor, R.attr.labelVisibilityMode, R.attr.menu};

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f13009i0 = {R.attr.headerLayout, R.attr.itemMinHeight, R.attr.menuGravity};

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f13011j0 = {16842931, 16842964, 16842973, 16843039, R.attr.bottomInsetScrimEnabled, R.attr.dividerInsetEnd, R.attr.dividerInsetStart, R.attr.drawerLayoutCornerSize, R.attr.elevation, R.attr.headerLayout, R.attr.itemBackground, R.attr.itemHorizontalPadding, R.attr.itemIconPadding, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemMaxLines, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemShapeFillColor, R.attr.itemShapeInsetBottom, R.attr.itemShapeInsetEnd, R.attr.itemShapeInsetStart, R.attr.itemShapeInsetTop, R.attr.itemTextAppearance, R.attr.itemTextColor, R.attr.itemVerticalPadding, R.attr.menu, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.subheaderColor, R.attr.subheaderInsetEnd, R.attr.subheaderInsetStart, R.attr.subheaderTextAppearance, R.attr.topInsetScrimEnabled};

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f13012k0 = {R.attr.materialCircleRadius};

    /* renamed from: l0  reason: collision with root package name */
    public static final int[] f13013l0 = {R.attr.minSeparation, R.attr.values};

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f13015m0 = {R.attr.insetForeground};

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f13016n0 = {R.attr.behavior_overlapTop};

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f13017o0 = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f13018p0 = {R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingEnd, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingStart, R.attr.contentPaddingTop, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f13019q0 = {16842766, 16842788, 16843078, 16843486, 16843487, R.attr.haloColor, R.attr.haloRadius, R.attr.labelBehavior, R.attr.labelStyle, R.attr.thumbColor, R.attr.thumbElevation, R.attr.thumbRadius, R.attr.thumbStrokeColor, R.attr.thumbStrokeWidth, R.attr.tickColor, R.attr.tickColorActive, R.attr.tickColorInactive, R.attr.tickVisible, R.attr.trackColor, R.attr.trackColorActive, R.attr.trackColorInactive, R.attr.trackHeight};

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f13020r0 = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};

    /* renamed from: s0  reason: collision with root package name */
    public static final int[] f13021s0 = {R.attr.useMaterialThemeColors};

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f13023t0 = {16842754, 16842994, 16843087};

    /* renamed from: u0  reason: collision with root package name */
    public static final int[] f13025u0 = {R.attr.tabBackground, R.attr.tabContentStart, R.attr.tabGravity, R.attr.tabIconTint, R.attr.tabIconTintMode, R.attr.tabIndicator, R.attr.tabIndicatorAnimationDuration, R.attr.tabIndicatorAnimationMode, R.attr.tabIndicatorColor, R.attr.tabIndicatorFullWidth, R.attr.tabIndicatorGravity, R.attr.tabIndicatorHeight, R.attr.tabInlineLabel, R.attr.tabMaxWidth, R.attr.tabMinWidth, R.attr.tabMode, R.attr.tabPadding, R.attr.tabPaddingBottom, R.attr.tabPaddingEnd, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabRippleColor, R.attr.tabSelectedTextColor, R.attr.tabTextAppearance, R.attr.tabTextColor, R.attr.tabUnboundedRipple};

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f13026v0 = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] w0 = {R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: x0  reason: collision with root package name */
    public static final int[] f13028x0 = {16842766, 16842906, 16843039, 16843071, 16843088, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};

    /* renamed from: y0  reason: collision with root package name */
    public static final int[] f13029y0 = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f13031z0 = {16842804, 16842904, 16842965, 16842998, 16843071, 16843072, 16843087, R.attr.backgroundTint};
    public static final a A0 = new a("FirebaseCrashlytics");
    public static final o1 B0 = new a();
    public static final o1 C0 = new a();
    public static final o1 D0 = new a();

    public /* synthetic */ a() {
    }

    public /* synthetic */ a(Object obj) {
    }

    public static boolean A(XmlPullParser xmlPullParser, String str) {
        return (xmlPullParser.getEventType() == 2) && xmlPullParser.getName().equals(str);
    }

    public static final int B(SegmentedByteString segment, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(segment, "$this$segment");
        int[] binarySearch = segment.f13731t;
        int i12 = i10 + 1;
        int length = segment.n.length;
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = binarySearch[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }

    public static void C(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            g gVar = (g) background;
            g.b bVar = gVar.f3929c;
            if (bVar.f3950o != f10) {
                bVar.f3950o = f10;
                gVar.C();
            }
        }
    }

    public static void D(View view, g gVar) {
        ra.a aVar = gVar.f3929c.f3939b;
        if (aVar != null && aVar.f14739a) {
            float e10 = n.e(view);
            g.b bVar = gVar.f3929c;
            if (bVar.n != e10) {
                bVar.n = e10;
                gVar.C();
            }
        }
    }

    public static FragmentViewBindingDelegate F(Fragment fragment, Function1 viewBindingFactory, Function1 function1, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        return new FragmentViewBindingDelegate(fragment, viewBindingFactory, null);
    }

    public static String I(zzix zzixVar) {
        StringBuilder sb2 = new StringBuilder(zzixVar.g());
        for (int i10 = 0; i10 < zzixVar.g(); i10++) {
            byte b10 = zzixVar.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            continue;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static w9.o J(w9.k r7, w9.o r8, h2.h r9, java.util.List r10) {
        /*
            r4 = r7
            w9.s r8 = (w9.s) r8
            r6 = 5
            java.lang.String r0 = r8.f17300c
            boolean r6 = r4.e(r0)
            r0 = r6
            r6 = 0
            r1 = r6
            r2 = 1
            r6 = 1
            if (r0 == 0) goto L3b
            java.lang.String r0 = r8.f17300c
            r6 = 4
            w9.o r4 = r4.l(r0)
            boolean r0 = r4 instanceof w9.i
            if (r0 == 0) goto L24
            w9.i r4 = (w9.i) r4
            w9.o r6 = r4.a(r9, r10)
            r4 = r6
            return r4
        L24:
            r6 = 6
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r6 = 5
            java.lang.String r8 = r8.f17300c
            r6 = 1
            r9[r1] = r8
            java.lang.String r8 = "%s is not a function"
            java.lang.String r8 = java.lang.String.format(r8, r9)
            r4.<init>(r8)
            r6 = 6
            throw r4
            r6 = 2
        L3b:
            r6 = 4
            java.lang.String r0 = r8.f17300c
            java.lang.String r3 = "hasOwnProperty"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6a
            r6 = 4
            a0.b.u0(r3, r2, r10)
            r6 = 2
            java.lang.Object r6 = r10.get(r1)
            r8 = r6
            w9.o r8 = (w9.o) r8
            w9.o r6 = r9.b(r8)
            r8 = r6
            java.lang.String r6 = r8.zzi()
            r8 = r6
            boolean r4 = r4.e(r8)
            if (r4 == 0) goto L66
            w9.o r4 = w9.o.f17261r
            r6 = 1
            return r4
        L66:
            w9.o r4 = w9.o.f17262s
            r6 = 5
            return r4
        L6a:
            r6 = 6
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r6 = 4
            java.lang.String r8 = r8.f17300c
            r9[r1] = r8
            r6 = 5
            java.lang.String r6 = "Object has no function %s"
            r8 = r6
            java.lang.String r8 = java.lang.String.format(r8, r9)
            r4.<init>(r8)
            throw r4
            r6 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.a.J(w9.k, w9.o, h2.h, java.util.List):w9.o");
    }

    public static float e(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float g(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final Completable h(Completable completable) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Scheduler io2 = Schedulers.io();
        Intrinsics.checkNotNullExpressionValue(io2, "io()");
        Completable applyScheduler = completable.subscribeOn(io2).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(applyScheduler, "applyScheduler");
        return applyScheduler;
    }

    public static final Single i(Single single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Scheduler io2 = Schedulers.io();
        Intrinsics.checkNotNullExpressionValue(io2, "io()");
        Single observeOn = single.subscribeOn(io2).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observeOn, "subscribeOn(scheduler).o…dSchedulers.mainThread())");
        return observeOn;
    }

    public static List j(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(k(((((bArr[11] & UByte.MAX_VALUE) << 8) | (bArr[10] & UByte.MAX_VALUE)) * 1000000000) / 48000));
        arrayList.add(k(80000000L));
        return arrayList;
    }

    public static byte[] k(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.Object m(java.lang.Object r5, java.lang.String r6, java.lang.Object r7) {
        /*
            r2 = r5
            if (r2 != 0) goto L44
            java.lang.String r2 = "%s"
            boolean r0 = r6.contains(r2)
            if (r0 == 0) goto L37
            r4 = 7
            int r4 = r6.indexOf(r2)
            r0 = r4
            int r4 = r6.lastIndexOf(r2)
            r1 = r4
            if (r0 != r1) goto L2c
            r4 = 3
            java.lang.Class r7 = (java.lang.Class) r7
            r4 = 1
            java.lang.String r4 = r7.getCanonicalName()
            r7 = r4
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = r6.replace(r2, r7)
            r0.<init>(r2)
            throw r0
            r4 = 5
        L2c:
            r4 = 2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r4 = 5
            java.lang.String r6 = "errorMessageTemplate has more than one format specifier"
            r2.<init>(r6)
            r4 = 6
            throw r2
        L37:
            r4 = 7
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r4 = 1
            java.lang.String r4 = "errorMessageTemplate has no format specifiers"
            r6 = r4
            r2.<init>(r6)
            r4 = 4
            throw r2
            r4 = 3
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.a.m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static k n(int i10) {
        if (i10 != 0 && i10 == 1) {
            return new d();
        }
        return new j();
    }

    public static int p(int i10) {
        return (int) ((i10 * n) + 0.5f);
    }

    public static boolean r(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int s(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float e10 = e(((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float e11 = e(((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float e12 = e((i10 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float e13 = e(((i11 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float e14 = e(((i11 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float e15 = e((i11 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float b10 = a0.a.b(((i11 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, f11, f10, f11);
        float b11 = a0.a.b(e13, e10, f10, e10);
        float b12 = a0.a.b(e14, e11, f10, e11);
        float b13 = a0.a.b(e15, e12, f10, e12);
        int round = Math.round(g(b11) * 255.0f) << 16;
        return Math.round(g(b13) * 255.0f) | round | (Math.round(b10 * 255.0f) << 24) | (Math.round(g(b12) * 255.0f) << 8);
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String u(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder m10 = a0.a.m(Typography.dollar);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                m10.append('[');
                m10.append(iArr2[i11]);
                m10.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                m10.append('.');
                if (strArr[i11] != null) {
                    m10.append(strArr[i11]);
                }
            }
        }
        return m10.toString();
    }

    public static int v(int i10, Object obj) {
        return (i10 * 37) + (obj != null ? obj.hashCode() : 0);
    }

    public static boolean w(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean x(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        boolean z10 = false;
        if ((xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str)) {
            z10 = true;
        }
        return z10;
    }

    public static synchronized boolean z(Context context) {
        Boolean bool;
        synchronized (a.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                Context context2 = f13001c;
                if (context2 != null && (bool = f13005f) != null) {
                    if (context2 == applicationContext) {
                        return bool.booleanValue();
                    }
                }
                f13005f = null;
                if (l9.g.a()) {
                    f13005f = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f13005f = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        f13005f = Boolean.FALSE;
                    }
                }
                f13001c = applicationContext;
                return f13005f.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void E(String str) {
        if (l(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void G(String str) {
        if (l(5)) {
            Log.w("FirebaseCrashlytics", str, null);
        }
    }

    public void H(String str, Throwable th) {
        if (l(5)) {
            Log.w("FirebaseCrashlytics", str, th);
        }
    }

    @Override // we.p
    public boolean a(int i10, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return true;
    }

    @Override // we.p
    public boolean b(int i10, List responseHeaders, boolean z10) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        return true;
    }

    @Override // we.p
    public void c(int i10, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
    }

    @Override // we.p
    public boolean d(int i10, h source, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        ((f) source).l(i11);
        return true;
    }

    @Override // ea.a
    public /* bridge */ /* synthetic */ Object f(ea.g gVar) {
        return null;
    }

    public boolean l(int i10) {
        if (4 > i10 && !Log.isLoggable("FirebaseCrashlytics", i10)) {
            return false;
        }
        return true;
    }

    public void o(String str) {
        if (l(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void q(String str) {
        if (l(6)) {
            Log.e("FirebaseCrashlytics", str, null);
        }
    }
}
