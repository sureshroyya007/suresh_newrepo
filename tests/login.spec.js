const { test, expect } = require('@playwright/test');

test('successful login', async ({ page }) => {
  await page.goto('http://localhost:3000/');
  await page.fill('#username', 'qadamin@admin.com');
  await page.fill('#password', 'gateway123');
  await page.click('#login-button');
  await expect(page).toHaveURL('http://localhost:3000/dashboard');
});

test('login fails with invalid credentials', async ({ page }) => {
  await page.goto('http://localhost:3000/');
  await page.fill('#username', 'invalid');
  await page.fill('#password', 'wrong');
  await page.click('#login-button');
  await expect(page.locator('.error-message')).toBeVisible();
});

test('login fails with empty fields', async ({ page }) => {
  await page.goto('http://localhost:3000/');
  await page.click('#login-button');
  await expect(page.locator('.validation-message')).toBeVisible();
});
