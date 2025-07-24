EditText noteEditor = findViewById(R.id.noteEditor);
noteEditor.setOnTouchListener((v, event) -> {
    v.getParent().requestDisallowInterceptTouchEvent(true); 
    return false;
});
