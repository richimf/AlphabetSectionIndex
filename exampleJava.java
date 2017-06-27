ND_SectionIndex rvSectionIndex = (ND_SectionIndex) view.findViewById(R.id.rvSectionIndex); 


            rvSectionIndex.onSectionIndexClickListener(new ND_SectionIndex.SectionIndexClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Log.i("quehace", "" + view + " = " + position);
                    String rowtext = lvCategories.getAdapter().getItem(position).toString();
                    lvCategories.smoothScrollToPosition(fruitList.indexOf(rowtext));
                }
            });