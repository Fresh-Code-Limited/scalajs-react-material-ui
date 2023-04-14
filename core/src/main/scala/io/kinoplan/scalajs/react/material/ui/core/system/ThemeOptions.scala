package io.kinoplan.scalajs.react.material.ui.core.system

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait ThemeOptions extends js.Object {
  def shape: js.UndefOr[ShapeOptions] = js.native

  def breakpoints: js.UndefOr[BreakpointsOptions] = js.native

  def direction: js.UndefOr[Direction.Value] = js.native

  def mixins: js.UndefOr[MixinsOptions] = js.native

  def palette: js.UndefOr[PaletteOptions] = js.native

  def shadows: js.UndefOr[js.Array[String]] = js.native

  def spacing: js.UndefOr[Double | (Double => (Double | String)) | ((Double | String) => (Double | String))] = js.native

  def transitions: js.UndefOr[TransitionsOptions] = js.native

  def components: js.UndefOr[Components] = js.native

  def typography: js.UndefOr[TypographyOptions | (Palette => TypographyOptions)] = js.native

  def zIndex: js.UndefOr[ZIndexOptions] = js.native
}

@js.native
trait ComponentOptions extends js.Object {
  def defaultProps: js.UndefOr[js.Object] = js.native

  def styleOverrides: js.UndefOr[js.Object] = js.native

  def variants: js.UndefOr[js.Object] = js.native
}

object ComponentOptions {
  def apply(defaultProps: js.UndefOr[js.Object] = js.undefined,
            styleOverrides: js.UndefOr[js.Object] = js.undefined,
            variants: js.UndefOr[js.Object] = js.undefined,
           ) = {
    val o: Map[String, Any] = Seq(
      defaultProps.toOption.map("defaultProps" -> _),
      styleOverrides.toOption.map("styleOverrides" -> _),
      variants.toOption.map("variants" -> _),
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ComponentOptions]
  }
}

@js.native
trait Components extends js.Object {
  def MuiAlert: js.UndefOr[ComponentOptions] = js.native

  def MuiAlertTitle: js.UndefOr[ComponentOptions] = js.native

  def MuiAppBar: js.UndefOr[ComponentOptions] = js.native

  def MuiAutocomplete: js.UndefOr[ComponentOptions] = js.native

  def MuiAvatar: js.UndefOr[ComponentOptions] = js.native

  def MuiAvatarGroup: js.UndefOr[ComponentOptions] = js.native

  def MuiBackdrop: js.UndefOr[ComponentOptions] = js.native

  def MuiBadge: js.UndefOr[ComponentOptions] = js.native

  def MuiBottomNavigation: js.UndefOr[ComponentOptions] = js.native

  def MuiBottomNavigationAction: js.UndefOr[ComponentOptions] = js.native

  def MuiBreadcrumbs: js.UndefOr[ComponentOptions] = js.native

  def MuiButton: js.UndefOr[ComponentOptions] = js.native

  def MuiButtonBase: js.UndefOr[ComponentOptions] = js.native

  def MuiButtonGroup: js.UndefOr[ComponentOptions] = js.native

  def MuiCard: js.UndefOr[ComponentOptions] = js.native

  def MuiCardActionArea: js.UndefOr[ComponentOptions] = js.native

  def MuiCardActions: js.UndefOr[ComponentOptions] = js.native

  def MuiCardContent: js.UndefOr[ComponentOptions] = js.native

  def MuiCardHeader: js.UndefOr[ComponentOptions] = js.native

  def MuiCardMedia: js.UndefOr[ComponentOptions] = js.native

  def MuiCheckbox: js.UndefOr[ComponentOptions] = js.native

  def MuiChip: js.UndefOr[ComponentOptions] = js.native

  def MuiCircularProgress: js.UndefOr[ComponentOptions] = js.native

  def MuiCollapse: js.UndefOr[ComponentOptions] = js.native

  def MuiContainer: js.UndefOr[ComponentOptions] = js.native

  def MuiCssBaseline: js.UndefOr[ComponentOptions] = js.native

  def MuiDialog: js.UndefOr[ComponentOptions] = js.native

  def MuiDialogActions: js.UndefOr[ComponentOptions] = js.native

  def MuiDialogContent: js.UndefOr[ComponentOptions] = js.native

  def MuiDialogContentText: js.UndefOr[ComponentOptions] = js.native

  def MuiDialogTitle: js.UndefOr[ComponentOptions] = js.native

  def MuiDivider: js.UndefOr[ComponentOptions] = js.native

  def MuiDrawer: js.UndefOr[ComponentOptions] = js.native

  def MuiAccordion: js.UndefOr[ComponentOptions] = js.native

  def MuiAccordionActions: js.UndefOr[ComponentOptions] = js.native

  def MuiAccordionDetails: js.UndefOr[ComponentOptions] = js.native

  def MuiAccordionSummary: js.UndefOr[ComponentOptions] = js.native

  def MuiFab: js.UndefOr[ComponentOptions] = js.native

  def MuiFilledInput: js.UndefOr[ComponentOptions] = js.native

  def MuiFormControl: js.UndefOr[ComponentOptions] = js.native

  def MuiFormControlLabel: js.UndefOr[ComponentOptions] = js.native

  def MuiFormGroup: js.UndefOr[ComponentOptions] = js.native

  def MuiFormHelperText: js.UndefOr[ComponentOptions] = js.native

  def MuiFormLabel: js.UndefOr[ComponentOptions] = js.native

  def MuiGrid: js.UndefOr[ComponentOptions] = js.native

  def MuiGrid2: js.UndefOr[ComponentOptions] = js.native

  def MuiImageList: js.UndefOr[ComponentOptions] = js.native

  def MuiImageListItem: js.UndefOr[ComponentOptions] = js.native

  def MuiImageListItemBar: js.UndefOr[ComponentOptions] = js.native

  def MuiIcon: js.UndefOr[ComponentOptions] = js.native

  def MuiIconButton: js.UndefOr[ComponentOptions] = js.native

  def MuiInput: js.UndefOr[ComponentOptions] = js.native

  def MuiInputAdornment: js.UndefOr[ComponentOptions] = js.native

  def MuiInputBase: js.UndefOr[ComponentOptions] = js.native

  def MuiInputLabel: js.UndefOr[ComponentOptions] = js.native

  def MuiLinearProgress: js.UndefOr[ComponentOptions] = js.native

  def MuiLink: js.UndefOr[ComponentOptions] = js.native

  def MuiList: js.UndefOr[ComponentOptions] = js.native

  def MuiListItem: js.UndefOr[ComponentOptions] = js.native

  def MuiListItemButton: js.UndefOr[ComponentOptions] = js.native

  def MuiListItemAvatar: js.UndefOr[ComponentOptions] = js.native

  def MuiListItemIcon: js.UndefOr[ComponentOptions] = js.native

  def MuiListItemSecondaryAction: js.UndefOr[ComponentOptions] = js.native

  def MuiListItemText: js.UndefOr[ComponentOptions] = js.native

  def MuiListSubheader: js.UndefOr[ComponentOptions] = js.native

  def MuiMenu: js.UndefOr[ComponentOptions] = js.native

  def MuiMenuItem: js.UndefOr[ComponentOptions] = js.native

  def MuiMobileStepper: js.UndefOr[ComponentOptions] = js.native

  def MuiModal: js.UndefOr[ComponentOptions] = js.native

  def MuiNativeSelect: js.UndefOr[ComponentOptions] = js.native

  def MuiOutlinedInput: js.UndefOr[ComponentOptions] = js.native

  def MuiPagination: js.UndefOr[ComponentOptions] = js.native

  def MuiPaginationItem: js.UndefOr[ComponentOptions] = js.native

  def MuiPaper: js.UndefOr[ComponentOptions] = js.native

  def MuiPopper: js.UndefOr[ComponentOptions] = js.native

  def MuiPopover: js.UndefOr[ComponentOptions] = js.native

  def MuiRadio: js.UndefOr[ComponentOptions] = js.native

  def MuiRating: js.UndefOr[ComponentOptions] = js.native

  def MuiScopedCssBaseline: js.UndefOr[ComponentOptions] = js.native

  def MuiSelect: js.UndefOr[ComponentOptions] = js.native

  def MuiSkeleton: js.UndefOr[ComponentOptions] = js.native

  def MuiSlider: js.UndefOr[ComponentOptions] = js.native

  def MuiSnackbar: js.UndefOr[ComponentOptions] = js.native

  def MuiSnackbarContent: js.UndefOr[ComponentOptions] = js.native

  def MuiSpeedDial: js.UndefOr[ComponentOptions] = js.native

  def MuiSpeedDialAction: js.UndefOr[ComponentOptions] = js.native

  def MuiSpeedDialIcon: js.UndefOr[ComponentOptions] = js.native

  def MuiStack: js.UndefOr[ComponentOptions] = js.native

  def MuiStep: js.UndefOr[ComponentOptions] = js.native

  def MuiStepButton: js.UndefOr[ComponentOptions] = js.native

  def MuiStepConnector: js.UndefOr[ComponentOptions] = js.native

  def MuiStepContent: js.UndefOr[ComponentOptions] = js.native

  def MuiStepIcon: js.UndefOr[ComponentOptions] = js.native

  def MuiStepLabel: js.UndefOr[ComponentOptions] = js.native

  def MuiStepper: js.UndefOr[ComponentOptions] = js.native

  def MuiSvgIcon: js.UndefOr[ComponentOptions] = js.native

  def MuiSwipeableDrawer: js.UndefOr[ComponentOptions] = js.native

  def MuiSwitch: js.UndefOr[ComponentOptions] = js.native

  def MuiTab: js.UndefOr[ComponentOptions] = js.native

  def MuiTable: js.UndefOr[ComponentOptions] = js.native

  def MuiTableBody: js.UndefOr[ComponentOptions] = js.native

  def MuiTableCell: js.UndefOr[ComponentOptions] = js.native

  def MuiTableContainer: js.UndefOr[ComponentOptions] = js.native

  def MuiTableFooter: js.UndefOr[ComponentOptions] = js.native

  def MuiTableHead: js.UndefOr[ComponentOptions] = js.native

  def MuiTablePagination: js.UndefOr[ComponentOptions] = js.native

  def MuiTableRow: js.UndefOr[ComponentOptions] = js.native

  def MuiTableSortLabel: js.UndefOr[ComponentOptions] = js.native

  def MuiTabs: js.UndefOr[ComponentOptions] = js.native

  def MuiTextField: js.UndefOr[ComponentOptions] = js.native

  def MuiToggleButton: js.UndefOr[ComponentOptions] = js.native

  def MuiToggleButtonGroup: js.UndefOr[ComponentOptions] = js.native

  def MuiToolbar: js.UndefOr[ComponentOptions] = js.native

  def MuiTooltip: js.UndefOr[ComponentOptions] = js.native

  def MuiTouchRipple: js.UndefOr[ComponentOptions] = js.native

  def MuiTypography: js.UndefOr[ComponentOptions] = js.native

  def MuiUseMediaQuery: js.UndefOr[ComponentOptions] = js.native
}

object Components {
  def apply(MuiAlert: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAlertTitle: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAppBar: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAutocomplete: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAvatar: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAvatarGroup: js.UndefOr[ComponentOptions] = js.undefined,
            MuiBackdrop: js.UndefOr[ComponentOptions] = js.undefined,
            MuiBadge: js.UndefOr[ComponentOptions] = js.undefined,
            MuiBottomNavigation: js.UndefOr[ComponentOptions] = js.undefined,
            MuiBottomNavigationAction: js.UndefOr[ComponentOptions] = js.undefined,
            MuiBreadcrumbs: js.UndefOr[ComponentOptions] = js.undefined,
            MuiButton: js.UndefOr[ComponentOptions] = js.undefined,
            MuiButtonBase: js.UndefOr[ComponentOptions] = js.undefined,
            MuiButtonGroup: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCard: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCardActionArea: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCardActions: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCardContent: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCardHeader: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCardMedia: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCheckbox: js.UndefOr[ComponentOptions] = js.undefined,
            MuiChip: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCircularProgress: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCollapse: js.UndefOr[ComponentOptions] = js.undefined,
            MuiContainer: js.UndefOr[ComponentOptions] = js.undefined,
            MuiCssBaseline: js.UndefOr[ComponentOptions] = js.undefined,
            MuiDialog: js.UndefOr[ComponentOptions] = js.undefined,
            MuiDialogActions: js.UndefOr[ComponentOptions] = js.undefined,
            MuiDialogContent: js.UndefOr[ComponentOptions] = js.undefined,
            MuiDialogContentText: js.UndefOr[ComponentOptions] = js.undefined,
            MuiDialogTitle: js.UndefOr[ComponentOptions] = js.undefined,
            MuiDivider: js.UndefOr[ComponentOptions] = js.undefined,
            MuiDrawer: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAccordion: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAccordionActions: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAccordionDetails: js.UndefOr[ComponentOptions] = js.undefined,
            MuiAccordionSummary: js.UndefOr[ComponentOptions] = js.undefined,
            MuiFab: js.UndefOr[ComponentOptions] = js.undefined,
            MuiFilledInput: js.UndefOr[ComponentOptions] = js.undefined,
            MuiFormControl: js.UndefOr[ComponentOptions] = js.undefined,
            MuiFormControlLabel: js.UndefOr[ComponentOptions] = js.undefined,
            MuiFormGroup: js.UndefOr[ComponentOptions] = js.undefined,
            MuiFormHelperText: js.UndefOr[ComponentOptions] = js.undefined,
            MuiFormLabel: js.UndefOr[ComponentOptions] = js.undefined,
            MuiGrid: js.UndefOr[ComponentOptions] = js.undefined,
            MuiGrid2: js.UndefOr[ComponentOptions] = js.undefined,
            MuiImageList: js.UndefOr[ComponentOptions] = js.undefined,
            MuiImageListItem: js.UndefOr[ComponentOptions] = js.undefined,
            MuiImageListItemBar: js.UndefOr[ComponentOptions] = js.undefined,
            MuiIcon: js.UndefOr[ComponentOptions] = js.undefined,
            MuiIconButton: js.UndefOr[ComponentOptions] = js.undefined,
            MuiInput: js.UndefOr[ComponentOptions] = js.undefined,
            MuiInputAdornment: js.UndefOr[ComponentOptions] = js.undefined,
            MuiInputBase: js.UndefOr[ComponentOptions] = js.undefined,
            MuiInputLabel: js.UndefOr[ComponentOptions] = js.undefined,
            MuiLinearProgress: js.UndefOr[ComponentOptions] = js.undefined,
            MuiLink: js.UndefOr[ComponentOptions] = js.undefined,
            MuiList: js.UndefOr[ComponentOptions] = js.undefined,
            MuiListItem: js.UndefOr[ComponentOptions] = js.undefined,
            MuiListItemButton: js.UndefOr[ComponentOptions] = js.undefined,
            MuiListItemAvatar: js.UndefOr[ComponentOptions] = js.undefined,
            MuiListItemIcon: js.UndefOr[ComponentOptions] = js.undefined,
            MuiListItemSecondaryAction: js.UndefOr[ComponentOptions] = js.undefined,
            MuiListItemText: js.UndefOr[ComponentOptions] = js.undefined,
            MuiListSubheader: js.UndefOr[ComponentOptions] = js.undefined,
            MuiMenu: js.UndefOr[ComponentOptions] = js.undefined,
            MuiMenuItem: js.UndefOr[ComponentOptions] = js.undefined,
            MuiMobileStepper: js.UndefOr[ComponentOptions] = js.undefined,
            MuiModal: js.UndefOr[ComponentOptions] = js.undefined,
            MuiNativeSelect: js.UndefOr[ComponentOptions] = js.undefined,
            MuiOutlinedInput: js.UndefOr[ComponentOptions] = js.undefined,
            MuiPagination: js.UndefOr[ComponentOptions] = js.undefined,
            MuiPaginationItem: js.UndefOr[ComponentOptions] = js.undefined,
            MuiPaper: js.UndefOr[ComponentOptions] = js.undefined,
            MuiPopper: js.UndefOr[ComponentOptions] = js.undefined,
            MuiPopover: js.UndefOr[ComponentOptions] = js.undefined,
            MuiRadio: js.UndefOr[ComponentOptions] = js.undefined,
            MuiRating: js.UndefOr[ComponentOptions] = js.undefined,
            MuiScopedCssBaseline: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSelect: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSkeleton: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSlider: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSnackbar: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSnackbarContent: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSpeedDial: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSpeedDialAction: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSpeedDialIcon: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStack: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStep: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStepButton: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStepConnector: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStepContent: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStepIcon: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStepLabel: js.UndefOr[ComponentOptions] = js.undefined,
            MuiStepper: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSvgIcon: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSwipeableDrawer: js.UndefOr[ComponentOptions] = js.undefined,
            MuiSwitch: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTab: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTable: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTableBody: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTableCell: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTableContainer: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTableFooter: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTableHead: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTablePagination: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTableRow: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTableSortLabel: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTabs: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTextField: js.UndefOr[ComponentOptions] = js.undefined,
            MuiToggleButton: js.UndefOr[ComponentOptions] = js.undefined,
            MuiToggleButtonGroup: js.UndefOr[ComponentOptions] = js.undefined,
            MuiToolbar: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTooltip: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTouchRipple: js.UndefOr[ComponentOptions] = js.undefined,
            MuiTypography: js.UndefOr[ComponentOptions] = js.undefined,
            MuiUseMediaQuery: js.UndefOr[ComponentOptions] = js.undefined,
           ) = {
    val o: Map[String, Any] = Seq(
      MuiAlert.toOption.map("MuiAlert" -> _),
      MuiAlertTitle.toOption.map("MuiAlertTitle" -> _),
      MuiAppBar.toOption.map("MuiAppBar" -> _),
      MuiAutocomplete.toOption.map("MuiAutocomplete" -> _),
      MuiAvatar.toOption.map("MuiAvatar" -> _),
      MuiAvatarGroup.toOption.map("MuiAvatarGroup" -> _),
      MuiBackdrop.toOption.map("MuiBackdrop" -> _),
      MuiBadge.toOption.map("MuiBadge" -> _),
      MuiBottomNavigation.toOption.map("MuiBottomNavigation" -> _),
      MuiBottomNavigationAction.toOption.map("MuiBottomNavigationAction" -> _),
      MuiBreadcrumbs.toOption.map("MuiBreadcrumbs" -> _),
      MuiButton.toOption.map("MuiButton" -> _),
      MuiButtonBase.toOption.map("MuiButtonBase" -> _),
      MuiButtonGroup.toOption.map("MuiButtonGroup" -> _),
      MuiCard.toOption.map("MuiCard" -> _),
      MuiCardActionArea.toOption.map("MuiCardActionArea" -> _),
      MuiCardActions.toOption.map("MuiCardActions" -> _),
      MuiCardContent.toOption.map("MuiCardContent" -> _),
      MuiCardHeader.toOption.map("MuiCardHeader" -> _),
      MuiCardMedia.toOption.map("MuiCardMedia" -> _),
      MuiCheckbox.toOption.map("MuiCheckbox" -> _),
      MuiChip.toOption.map("MuiChip" -> _),
      MuiCircularProgress.toOption.map("MuiCircularProgress" -> _),
      MuiCollapse.toOption.map("MuiCollapse" -> _),
      MuiContainer.toOption.map("MuiContainer" -> _),
      MuiCssBaseline.toOption.map("MuiCssBaseline" -> _),
      MuiDialog.toOption.map("MuiDialog" -> _),
      MuiDialogActions.toOption.map("MuiDialogActions" -> _),
      MuiDialogContent.toOption.map("MuiDialogContent" -> _),
      MuiDialogContentText.toOption.map("MuiDialogContentText" -> _),
      MuiDialogTitle.toOption.map("MuiDialogTitle" -> _),
      MuiDivider.toOption.map("MuiDivider" -> _),
      MuiDrawer.toOption.map("MuiDrawer" -> _),
      MuiAccordion.toOption.map("MuiAccordion" -> _),
      MuiAccordionActions.toOption.map("MuiAccordionActions" -> _),
      MuiAccordionDetails.toOption.map("MuiAccordionDetails" -> _),
      MuiAccordionSummary.toOption.map("MuiAccordionSummary" -> _),
      MuiFab.toOption.map("MuiFab" -> _),
      MuiFilledInput.toOption.map("MuiFilledInput" -> _),
      MuiFormControl.toOption.map("MuiFormControl" -> _),
      MuiFormControlLabel.toOption.map("MuiFormControlLabel" -> _),
      MuiFormGroup.toOption.map("MuiFormGroup" -> _),
      MuiFormHelperText.toOption.map("MuiFormHelperText" -> _),
      MuiFormLabel.toOption.map("MuiFormLabel" -> _),
      MuiGrid.toOption.map("MuiGrid" -> _),
      MuiGrid2.toOption.map("MuiGrid2" -> _),
      MuiImageList.toOption.map("MuiImageList" -> _),
      MuiImageListItem.toOption.map("MuiImageListItem" -> _),
      MuiImageListItemBar.toOption.map("MuiImageListItemBar" -> _),
      MuiIcon.toOption.map("MuiIcon" -> _),
      MuiIconButton.toOption.map("MuiIconButton" -> _),
      MuiInput.toOption.map("MuiInput" -> _),
      MuiInputAdornment.toOption.map("MuiInputAdornment" -> _),
      MuiInputBase.toOption.map("MuiInputBase" -> _),
      MuiInputLabel.toOption.map("MuiInputLabel" -> _),
      MuiLinearProgress.toOption.map("MuiLinearProgress" -> _),
      MuiLink.toOption.map("MuiLink" -> _),
      MuiList.toOption.map("MuiList" -> _),
      MuiListItem.toOption.map("MuiListItem" -> _),
      MuiListItemButton.toOption.map("MuiListItemButton" -> _),
      MuiListItemAvatar.toOption.map("MuiListItemAvatar" -> _),
      MuiListItemIcon.toOption.map("MuiListItemIcon" -> _),
      MuiListItemSecondaryAction.toOption.map("MuiListItemSecondaryAction" -> _),
      MuiListItemText.toOption.map("MuiListItemText" -> _),
      MuiListSubheader.toOption.map("MuiListSubheader" -> _),
      MuiMenu.toOption.map("MuiMenu" -> _),
      MuiMenuItem.toOption.map("MuiMenuItem" -> _),
      MuiMobileStepper.toOption.map("MuiMobileStepper" -> _),
      MuiModal.toOption.map("MuiModal" -> _),
      MuiNativeSelect.toOption.map("MuiNativeSelect" -> _),
      MuiOutlinedInput.toOption.map("MuiOutlinedInput" -> _),
      MuiPagination.toOption.map("MuiPagination" -> _),
      MuiPaginationItem.toOption.map("MuiPaginationItem" -> _),
      MuiPaper.toOption.map("MuiPaper" -> _),
      MuiPopper.toOption.map("MuiPopper" -> _),
      MuiPopover.toOption.map("MuiPopover" -> _),
      MuiRadio.toOption.map("MuiRadio" -> _),
      MuiRating.toOption.map("MuiRating" -> _),
      MuiScopedCssBaseline.toOption.map("MuiScopedCssBaseline" -> _),
      MuiSelect.toOption.map("MuiSelect" -> _),
      MuiSkeleton.toOption.map("MuiSkeleton" -> _),
      MuiSlider.toOption.map("MuiSlider" -> _),
      MuiSnackbar.toOption.map("MuiSnackbar" -> _),
      MuiSnackbarContent.toOption.map("MuiSnackbarContent" -> _),
      MuiSpeedDial.toOption.map("MuiSpeedDial" -> _),
      MuiSpeedDialAction.toOption.map("MuiSpeedDialAction" -> _),
      MuiSpeedDialIcon.toOption.map("MuiSpeedDialIcon" -> _),
      MuiStack.toOption.map("MuiStack" -> _),
      MuiStep.toOption.map("MuiStep" -> _),
      MuiStepButton.toOption.map("MuiStepButton" -> _),
      MuiStepConnector.toOption.map("MuiStepConnector" -> _),
      MuiStepContent.toOption.map("MuiStepContent" -> _),
      MuiStepIcon.toOption.map("MuiStepIcon" -> _),
      MuiStepLabel.toOption.map("MuiStepLabel" -> _),
      MuiStepper.toOption.map("MuiStepper" -> _),
      MuiSvgIcon.toOption.map("MuiSvgIcon" -> _),
      MuiSwipeableDrawer.toOption.map("MuiSwipeableDrawer" -> _),
      MuiSwitch.toOption.map("MuiSwitch" -> _),
      MuiTab.toOption.map("MuiTab" -> _),
      MuiTable.toOption.map("MuiTable" -> _),
      MuiTableBody.toOption.map("MuiTableBody" -> _),
      MuiTableCell.toOption.map("MuiTableCell" -> _),
      MuiTableContainer.toOption.map("MuiTableContainer" -> _),
      MuiTableFooter.toOption.map("MuiTableFooter" -> _),
      MuiTableHead.toOption.map("MuiTableHead" -> _),
      MuiTablePagination.toOption.map("MuiTablePagination" -> _),
      MuiTableRow.toOption.map("MuiTableRow" -> _),
      MuiTableSortLabel.toOption.map("MuiTableSortLabel" -> _),
      MuiTabs.toOption.map("MuiTabs" -> _),
      MuiTextField.toOption.map("MuiTextField" -> _),
      MuiToggleButton.toOption.map("MuiToggleButton" -> _),
      MuiToggleButtonGroup.toOption.map("MuiToggleButtonGroup" -> _),
      MuiToolbar.toOption.map("MuiToolbar" -> _),
      MuiTooltip.toOption.map("MuiTooltip" -> _),
      MuiTouchRipple.toOption.map("MuiTouchRipple" -> _),
      MuiTypography.toOption.map("MuiTypography" -> _),
      MuiUseMediaQuery.toOption.map("MuiUseMediaQuery" -> _),
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Components]
  }
}

object ThemeOptions {

  def apply(
             shape: js.UndefOr[ShapeOptions] = js.undefined,
             breakpoints: js.UndefOr[BreakpointsOptions] = js.undefined,
             direction: js.UndefOr[Direction.Value] = js.undefined,
             mixins: js.UndefOr[MixinsOptions] = js.undefined,
             palette: js.UndefOr[PaletteOptions] = js.undefined,
             shadows: js.UndefOr[js.Array[String]] = js.undefined,
             spacing: js.UndefOr[Double | (Double => (Double | String)) | ((Double | String) => (Double | String))] = js.undefined,
             transitions: js.UndefOr[TransitionsOptions] = js.undefined,
             components: js.UndefOr[Components] = js.undefined,
             typography: js.UndefOr[TypographyOptions | js.Function1[Palette, TypographyOptions]] = js.undefined,
             zIndex: js.UndefOr[ZIndexOptions] = js.undefined,
           ) = {
    val o: Map[String, Any] = Seq(
      shape.toOption.map("shape" -> _),
      breakpoints.toOption.map("breakpoints" -> _),
      direction.toOption.map("direction" -> _),
      mixins.toOption.map("mixins" -> _),
      palette.toOption.map("palette" -> _),
      shadows.toOption.map("shadows" -> _),
      spacing.toOption.map("spacing" -> _),
      transitions.toOption.map("transitions" -> _),
      components.toOption.map("components" -> _),
      typography.toOption.map("typography" -> _),
      zIndex.toOption.map("zIndex" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ThemeOptions]
  }

}
