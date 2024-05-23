import { createWebHistory, createRouter } from 'vue-router';
import Home from '../components/Home.vue';
import Board from '../components/Board.vue';
import Test from '../components/Test.vue'


const routes = [
  {
    path: "/",
    component: Home,
  },
  {
    path: "/board",
    component: Board,
  },
  {
	path: "/test",
	component: Test,
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 