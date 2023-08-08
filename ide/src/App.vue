<template>
  <q-layout
    view="lhh LpR lff"
    container
    style="height: 100vh" 
    class="shadow-2 rounded-borders"
    :class="$q.dark.isActive ? 'bg-grey-9' : 'bg-grey-3'"
  >
    <q-header reveal :class="$q.dark.isActive ? 'bg-secondary' : 'bg-black'">
      <Toolbar />
    </q-header>

    <q-drawer
      side="right"
      v-model="drawerRight"
      bordered
      :width="200"
      :breakpoint="500"
    >
      <q-scroll-area class="fit">
        <div class="q-pa-sm">
          <div v-for="n in 50" :key="n">File {{ n }} / 50</div>
        </div>
      </q-scroll-area>
    </q-drawer>

    <q-page-container>
      <q-page class="q-md">
        <FileEditor />
        <!-- <q-page-sticky position="top-left" :offset="[18, 68]">
          <q-btn round color="primary" icon="arrow_back" class="rotate-45" />
        </q-page-sticky>
        <q-page-sticky position="top-right" :offset="[18, 68]">
          <q-btn round color="primary" icon="arrow_upward" class="rotate-45" />
        </q-page-sticky>
        <q-page-sticky position="bottom-left" :offset="[18, 18]">
          <q-btn round color="primary" icon="arrow_forward" class="rotate-135" />
        </q-page-sticky>
        <q-page-sticky position="bottom-right" :offset="[18, 18]">
          <q-btn round color="primary" icon="arrow_forward" class="rotate-45" />
        </q-page-sticky>

        <q-page-sticky position="top" expand class="bg-primary text-white">
          <q-toolbar>
            <q-btn flat round dense icon="map" />
            <q-toolbar-title>Title</q-toolbar-title>
          </q-toolbar>
        </q-page-sticky> -->
      </q-page>

      <q-page-scroller position="bottom">
        <q-btn fab icon="keyboard_arrow_up" color="red" />
      </q-page-scroller>
    </q-page-container>
  </q-layout>
</template>

<script>
import { ref } from 'vue';
// import HelloWorld from './components/HelloWorld.vue';
import Toolbar from './components/ToolBar.vue';
import FileEditor from './components/FileEditor.vue';

export default {
  name: 'LayoutDefault',

  components: {
    Toolbar,
    // HelloWorld,
    FileEditor,
  },
  setup () {
    return {
      leftDrawerOpen: ref(true),
      drawerLeft: ref(true),
      drawerRight: ref(true),
    }
  },
}
</script>
