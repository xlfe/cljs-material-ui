(ns cljs-material-ui.elements
  (:require [cljs-material-ui.core :as m]))

; export (\w*) .*
; $1
(def tags
  '[AppBar
    Avatar
    Backdrop
    Badge
    BottomNavigation
    BottomNavigationAction
    Button
    ButtonBase
    Card
    CardActionArea
    CardActions
    CardContent
    CardHeader
    CardMedia
    Checkbox
    Chip
    CircularProgress
    ClickAwayListener
    Collapse
    CssBaseline
    Dialog
    DialogActions
    DialogContent
    DialogContentText
    DialogTitle
    Divider
    Drawer
    ExpansionPanel
    ExpansionPanelActions
    ExpansionPanelDetails
    ExpansionPanelSummary
    Fade
    FilledInput
    FormControl
    FormControlLabel
    FormGroup
    FormHelperText
    FormLabel
    Grid
    GridList
    GridListTile
    GridListTileBar
    Grow
    Hidden
    Icon
    IconButton
    Input
    InputAdornment
    InputBase
    InputLabel
    jssPreset
    LinearProgress
    List
    ListItem
    ListItemAvatar
    ListItemIcon
    ListItemSecondaryAction
    ListItemText
    ListSubheader
    Menu
    MenuItem
    MenuList
    MobileStepper
    Modal
    ModalManager
    MuiThemeProvider
    NativeSelect
    NoSsr
    OutlinedInput
    Paper
    Popover
    Popper
    Portal
    Radio
    RadioGroup
    RootRef
    Select
    Slide
    Snackbar
    SnackbarContent
    Step
    StepButton
    StepConnector
    StepContent
    StepIcon
    StepLabel
    Stepper
    SvgIcon
    SwipeableDrawer
    Switch
    Tab
    Table
    TableBody
    TableCell
    TableFooter
    TableHead
    TablePagination
    TableRow
    TableSortLabel
    Tabs
    TextField
    Toolbar
    Tooltip
    Typography
    Zoom])

(defmacro generate-mui-el-fns [fname]
  `(m/generate-mui-dom-fns ~fname ~tags))

(defmacro generate-mui-reagent-fns [tags]
  `(do ~@(map m/generate-mui-reagent-fn tags)))

(defmacro generate-mui-rum-fns [tags]
  `(do ~@(map m/generate-mui-rum-fn tags)))

(comment
  (macroexpand `(generate-mui-el-fns "create-mui-el"))
  (macroexpand `(generate-mui-reagent-fns ~tags))
  (macroexpand `(generate-mui-rum-fns ~tags)))
